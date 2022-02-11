package CC_ze;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;





public class sql_handler
{
	
	static Connection conn = null;
	static Statement  stm  = null;
	static GUI_main main;
	static GUI_msg msg;

	
	public static Connection connect() // creates the Database connection to communicate with the database
	{
		
		
		try
		{
			String url = "jdbc:sqlite:./Sources/zeiterfassung.db";
			
			conn = DriverManager.getConnection(url);
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			msg= new GUI_msg(6);
		}
		
		
		return conn;
	
		
	}
	
	public static Object login(String pName, String pPassword)
	{
		
		conn = connect();
		
		
		try
		{
			stm = conn.createStatement();
			String query = "select personPassword, personRole from Person where personUsername ='" + pName + "';";
		
			
			ResultSet rs = stm.executeQuery(query);
			int Role = rs.getInt("personRole"); 
			
			String password = Krypt.base64Decode(rs.getString("personPassword"));
			
			
			if (password.equals(pPassword))
			{
				
				
				switch (Role)
				{
					case 1 -> main = new GUI_main(1);
					case 2 -> main = new GUI_main(2);
					case 3 -> main = new GUI_main(3);
					case 4 -> main = new GUI_main(4);
				}
				
				
			}
			else
			{
				msg= new GUI_msg(10);
			}
			
			
			
		}
		
		catch (SQLException e)
		{
			 msg = new GUI_msg(404);
		}
		finally
		{
			
			
			try
			{
				conn.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			
		}
		
		
		
		GUI_login.frame.dispose();
		
		return null;
	}
	public static void manipulate(String query) // sends commands to the database to manipulate data
	{
		conn = connect();

		try
		{
			stm = conn.createStatement();
			stm.executeUpdate(query);
		}
		catch (Exception e)
		{
			msg = new GUI_msg(404);
		}
		finally
		{

			try
			{
				conn.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}


	public static String[] searchP(String user) // sends a query to the database and assigns the tuple to dataset
	{
		conn = connect();

		try
		{
			stm = conn.createStatement();
			String query = "select * from Person where personUsername ='" + user + "';";

			ResultSet rs = stm.executeQuery(query);

			if (!rs.isBeforeFirst())
			{
				msg = new GUI_msg(404);
			}
			else
			{

				while (rs.next())
				{

					ZE_main.data[0] = rs.getString("personID");
					ZE_main.data[1] = rs.getString("personName");
					ZE_main.data[2] = rs.getString("personLastName");
					ZE_main.data[3] = rs.getString("personStreetNumber");
					ZE_main.data[4] = rs.getString("personZIP");
					ZE_main.data[5] = rs.getString("personTown");
					ZE_main.data[6] = rs.getString("personBDate");
					ZE_main.data[7] = rs.getString("personPhone");
					ZE_main.data[8] = rs.getString("personMail");
					ZE_main.data[9] = rs.getString("personRole");
					ZE_main.data[10] = rs.getString("personUsername");
					ZE_main.data[11] = rs.getString("personPassword");
				}
			}

		}
		catch (SQLException e)
		{
			msg = new GUI_msg(3);
		}
		finally
		{

			try
			{
				conn.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return ZE_main.data;
	}
	public static ArrayList searchT(String user, Date date) // sends a query to the database and assigns the tuple to dataset
	{
		conn = connect();
		
		try
		{
			stm = conn.createStatement();
			String query = "select * from Timerecording where(select personID from Person where personUsername ='" + user + "and timeDate = " + date + ");";
			
			ResultSet rs = stm.executeQuery(query);
			
			if (!rs.isBeforeFirst())
			{
				msg = new GUI_msg(404);
			}
			else
			{
				ZE_main.wArraytime.add(0, rs.getString("personID"));
				ZE_main.wArraytime.add(1, rs.getString("timeDate"));
				ZE_main.wArraytime.add(2, rs.getString("timeTargetHours"));
				
				while (rs.next())
				{
					
					ZE_main.wtime[0]= rs.getTime("timeStart");
					ZE_main.wtime[1]=rs.getTime("timeEnd");
					
					ZE_main.wArraytime.add(ZE_main.wtime);
				}
			}
			
		}
		catch (SQLException e)
		{
			msg = new GUI_msg(3);
		}
		finally
		{
			
			try
			{
				conn.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return ZE_main.wArraytime;
	}
	public static ArrayList searchB(String user, Date date) // sends a query to the database and assigns the tuple to dataset
	{
		conn = connect();
		
		try
		{
			stm = conn.createStatement();
			String query = "select * from Breakrecording where(select personID from Person where personUsername ='" + user + "and breakDate = " + date + ");";
			
			ResultSet rs = stm.executeQuery(query);
			
			if (!rs.isBeforeFirst())
			{
				msg = new GUI_msg(404);
			}
			else
			{
				ZE_main.bArraytime.add(0, rs.getString("personID"));
				ZE_main.bArraytime.add(1, rs.getString("breakDate"));
				
				
				while (rs.next())
				{
					
					ZE_main.btime[0]= rs.getTime("breakStart");
					ZE_main.btime[1]=rs.getTime("breakEnd");
					
					ZE_main.bArraytime.add(ZE_main.wtime);
				}
			}
			
		}
		catch (SQLException e)
		{
			msg = new GUI_msg(3);
		}
		finally
		{
			
			try
			{
				conn.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return ZE_main.bArraytime;
	}


	
	
}
