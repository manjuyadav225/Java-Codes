import java.util.ArrayList;
import java.util.Scanner;

public class LaunchSC {
	
	static void monthList()
	{
        ArrayList<String> futureMonths = new ArrayList<String>();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Please enter the month number ");
		int month = sc1.nextInt();
		switch(month)
		{
		case 1: futureMonths.add("January");
		case 2: futureMonths.add("February");
		case 3: futureMonths.add("March");
		case 4: futureMonths.add("April");
		case 5: futureMonths.add("May");
		case 6: futureMonths.add("June");
		case 7: futureMonths.add("July");
		case 8: futureMonths.add("August");
		case 9: futureMonths.add("September");
		case 10: futureMonths.add("October");
		case 11: futureMonths.add("November");
		case 12: futureMonths.add("December");
		break;
		default : break;
	
		}
		if(month<0 || month>12)
			{
			  System.out.println("Please enter month numbers between 1 to 12");
		      monthList();
			}
		else
		System.out.println(futureMonths);
		
	}
	

	public static void main(String[] args) {
	/*	String str;
		System.out.println("Please enter the day"); 
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		switch(str)
		{
		case "Monday", "Tuesday", "Wednesday" ->
		 System.out.println("6am");
		 
		case "Thursday", "Friday", "Saturday" ->
		 System.out.println("7am");
		 
		case "Sunday" ->
		 System.out.println("8am");
		 
		default ->
		 System.out.println("10am");
		} */
		String monthName=null;
		int month=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number: ");
		month = sc.nextInt();
		
		switch(month)
		{
		case 1: monthName = "January";
		   break;
		case 2: monthName = "February";
		   break;
		case 3: monthName = "March";
		   break;  
		case 4: monthName = "April";
		   break; 
		case 5: monthName = "May";
		   break;
		case 6: monthName = "June";
		   break;
		case 7: monthName = "July";
		   break;
		case 8: monthName = "August";
		   break; 
		case 9: monthName = "September";
		   break; 
		case 10: monthName = "October";
		   break; 
		case 11: monthName = "November";
		   break;
		case 12: monthName = "December";
		   break;   
		default: monthName = "InvalidMonth"; 
		   break;
		}
		System.out.println("Your month is: " +monthName);
		monthList();
	
		
	}

}
