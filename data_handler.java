package CC_ze;

public class data_handler
{

	public static String deleteData(String[] data) // delete whole user dataset when wrong
	{
		String delete = "Delete from Teilnehmer where Name = '" + data[1] + "';)";
		return delete;
	}

	public static String deleteN(int pDelete)
	{
		String query = "Delete from Person where personID = " + pDelete + ";";
		return query;
	}

	public static String ppInsert(String[] data)
	{
		String query = "Insert Into Person (personName,personLastName,personStreetNumber,personZIP,personTown,personBDate,personPhone,personMail,personRole)"
				+ "values ('" + data[1]+ "','" + data[2]+ "','" + data[3] + "','" + data[4] + "','" + data[5] 
				+ "','" + data[6] + "','" + data[7] + "','" + data[8] + "','" + data[9] + "');";
		return query;
	}

	public static void user(String[] data)
	{
		try
		{

			if (data[1].equals("Anne") & data[2].equals("Heyer"))
			{
				data[10] = "Padavan1";
				
			}

			else if (data[1].equals("Karsten") & data[2].equals("Witting"))
			{
				data[10] = "Padavan2";
			}

			else if (data[1].equals("Thomas") & data[2].equals("Jackisch"))
			{
				data[10] = "Master";
			}

			else
			{
			ZE_main.data[10]= data[2].substring(0, 3) + data[1].substring(0, 2) + data[0];
			
		}
			sql_handler.manipulate(data_handler.update(ZE_main.data));
		}

		catch (Exception e)
		{
			GUI_msg msg = new GUI_msg(7);
		}
		
	}

	public static void print(String user)
	{
		sql_handler.searchP(user);
		GUI_main.tf_fname.setText(ZE_main.data[1]);
		GUI_main.tf_lname.setText(ZE_main.data[2]);
		GUI_main.tf_str.setText(ZE_main.data[3]);
		GUI_main.tf_post.setText(ZE_main.data[4]);
		GUI_main.tf_city.setText(ZE_main.data[5]);
		GUI_main.tf_bDate.setText(ZE_main.data[6]);
		GUI_main.tf_tel.setText(ZE_main.data[7]);
		GUI_main.tf_mail.setText(ZE_main.data[8]);
		GUI_main.tf_username.setText(ZE_main.data[10]);
		GUI_main.pw_pw.setText(ZE_main.data[11] + "");
		
	}

	public static String newpw(String[] data)
	{
		// ================================================================================================
				//
				// PW generated of 1 each of caps, smalls, numbers, and special chars plus 12 random out of these
				// 
				// ================================================================================================

				String smalls = "abcdefghijklmnopqrstuvwxyz";
				String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String number = "0123456789";
				String special = "!?/\\€&%$§@#*+-{}[]=_"; 

				String cPassword = "" + caps.charAt((int) (Math.random() * 26)) + smalls.charAt((int) (Math.random() * 26)) // fill out first 4 chars to match rules
						+ number.charAt((int) (Math.random() * 10)) + special.charAt((int) (Math.random() * 20));

				int i = 12;
				double x = 0;

				while (i > 0) // fill out 12 rest chars with random from random list
				{
					x = Math.random();

					if (x < 0.25)
					{
						cPassword += caps.charAt((int) (Math.random() * 26));
					}
					else if (x > 0.25 && x < 0.5)
					{
						cPassword += smalls.charAt((int) (Math.random() * 26));
					}
					else if (x > 0.5 && x < 0.75)
					{
						cPassword += special.charAt((int) (Math.random() * 20));
					}
					else
					{
						cPassword += number.charAt((int) (Math.random() * 10));
					}

					i -= 1;

				}
				return data[11] = Krypt.base64Encode(cPassword);
			}
	

		
	

	public static String update(String[] data)
	{
		String query = "Update Person set personName = '" + data[1] +  "', personLastName = '" + data[2] + "', personStreetNumber = '" + data[3] + "', personZIP = '" + data[4] 
				       + "', personTown = '" + data[5] + "', personBDate = '" + data [6] + "', personPhone = '" + data[7] + "', personMail = '" + data[8]
				          + "', personUsername = '" + data[10] +  "' where personUsername = '" + ZE_main.temp + "';" ;
		return query;
	}
	
	
	public static String updatePa(String[] data)
	{
		String query = "Update Person set personPassword = '" + data[11] + "' where personUsername = '" + ZE_main.temp + "';" ;
		return query;
	}

}