
package com.vietjack;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		Calendar cal = new GregorianCalendar(2018,8,28);
		System.out.println("Date: " + sdf.format(cal.getTime()));
		// add one month
		cal.add(Calendar.MONTH,1);
		System.out.println("Date: " + sdf.format(cal.getTime()));
		// subtract 10 days
		cal.add(Calendar.DAY_OF_MONTH,-10);
		System.out.println("Date: " + sdf.format(cal.getTime()));
		Calendar calendar2 = new GregorianCalendar(1990,04,03);
		Date birthday = calendar2.getTime();
		Date nowDate = Calendar.getInstance().getTime();
		
		//01-01-1970 den hien tai
		long timeInMiliSecond = nowDate.getTime() - birthday.getTime();
		long timeInSecond = timeInMiliSecond/1000;
		long year = timeInSecond/(60*60*24*365);
		System.out.println("Tuoi: "+year);
	}	
}
