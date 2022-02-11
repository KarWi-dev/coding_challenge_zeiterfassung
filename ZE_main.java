package CC_ze;

import java.sql.Time;
import java.util.*;
public class ZE_main
{
//	data[0] = personID
//	data[1] = personName
//	data[2] = personLastName
//	data[3] = personStreetNumber
//	data[4] = personZIP
//	data[5] = personTown
//	data[6] = personBDate
//	data[7] = personPhone
//	data[8] = personMail
//	data[9] = personRole
//	data[10] = personUsername
//	data[11] = personPassword
//
//	wtime[0] = timeStart
//	wtime[1] = timeEnd
//
//	btime[0] = breakStart
//	btime[1] = breakEnd
//
//	wArraytime[0] = personID
//	wArraytime[1] = timeDate
//	wArraytime[2] = wtime
//
//	bArraytime[0] = personID
//	bArraytime[1] = breakDate
//	bArraytime[2] = btime



	public static String[] data= new String[12];
	public static ArrayList wArraytime= new ArrayList();
	public static ArrayList bArraytime= new ArrayList();
	public static Time[] wtime = new Time[2];
	public static Time[] btime = new Time[2];
	public static String temp;
	
	public static void main(String[] args)
	{
		GUI_login init = new GUI_login();
System.out.println(Krypt.base64Decode("S2MxwqczMms04oKsXDdMWU9FUQ=="));
	}

}


//TODO Zeit und Pause abrufen

//TODO rolleTextfeld + Label, textaerea 2nd tab