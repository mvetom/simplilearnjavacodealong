package simplilearn.java.core.control;

public class SwitchStatement
{

	public static void switchStatementMain()
	{
		
		int mon = 4;
		
		String month;
		
		switch(mon)
		{
		   case	1:
			   month = "January";
			   break;
		   case 2:
		   	   month = "February";
		   	 break;
		   case 3:
			   System.out.println("I'm able to print something,  and keep going");
		   case 4:
			   month = "Marpril";
			   break;
		   case 5:
			   month = "May";
			   break;
		   case 6: 
			   month = "June";
			   break;
		   case 7: 
			   month = "July";
			   break;
		   case 8:
			   month = "August";
			   break;
		   case 9:
			   month = "September";
			   break;
		   case 10:
			    month = "October";
			    break;
		   case 11:
			     month = "November";
			     break;
		   case 12:
			     month = "December";
			     break;
		   default:
			      month = "AN INVALID MONTH!!"; 
			   
		}
		
		System.out.println("Your month is: " + month);
	}

}
