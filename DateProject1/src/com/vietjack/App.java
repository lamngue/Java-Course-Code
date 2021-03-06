package com.vietjack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string to date
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String strDate = "21-09-2018";
		try {
			Date date1 = sdf.parse(strDate);
			System.out.println(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//date to string
		Date date2 = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String dateString = sdf2.format(date2);
		System.out.println(dateString);
		
		//Date to calendar
		Date date3 = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date3);
		System.out.println("Year: "+cal.get(Calendar.YEAR));
		System.out.println("Month: "+cal.get(Calendar.MONTH));
		System.out.println("Date: "+cal.get(Calendar.DATE));
		System.out.println("Hour: "+cal.get(Calendar.HOUR));
		System.out.println("Year: "+cal.get(Calendar.MINUTE));
		
		//Calendar to date
		Calendar cal1 = new GregorianCalendar(2018,8,28);
		Date date4 = cal1.getTime();
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
		String dateString2 = sdf3.format(date4);
		System.out.println(dateString2);
	}
}
