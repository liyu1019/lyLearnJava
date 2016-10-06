package com.liyu.demo1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
/**
 * 练习
 * @author LIYU
 *
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输出当前时间
//		Date s=new Date();
//		System.out.println(s);
//		GregorianCalendar d=new GregorianCalendar();
//		int month=d.get(Calendar.MONTH);
//		int weekday=d.get(Calendar.DAY_OF_WEEK);
//		System.out.println("month : "+month);
//		System.out.println("weekday : "+weekday);
//		d.set(Calendar.YEAR,2018);
//		//增加年		
//		d.add(Calendar.YEAR, 2);
//		int year=d.get(Calendar.YEAR);
//		System.out.println("year : "+year);
////      isisLeapYear(int year)判定是否为闰年		
//		System.out.println(d.isLeapYear(2009));
		GregorianCalendar calendar = new GregorianCalendar(2013,10,05);
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH);
		int today=calendar.get(Calendar.DATE);
		System.out.println("today"+year);
		System.out.println("month"+month);
		System.out.println("today"+today);
//		Date time = calendar.getTime();
//		System.out.println(time);
	}

}
