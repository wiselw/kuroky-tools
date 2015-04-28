package com.kuroky.entity.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dateTest();
		calendarTest();
		calendarToDate();
	}
	public static void calendarTest(){
		Calendar cal=Calendar.getInstance();
		if(cal instanceof GregorianCalendar){
			System.out.println("It is an instance of GregorianCalendar");
		}
		System.out.println(cal.getFirstDayOfWeek());
		Calendar calendar = Calendar.getInstance();
		// 从一个 Calendar 对象中获取 Date 对象
		Date date = calendar.getTime();
		// 将 Date 对象反应到一个 Calendar 对象中，
		// Calendar/GregorianCalendar 没有构造函数可以接受 Date 对象
		// 所以我们必需先获得一个实例，然后设置 Date 对象
		calendar.setTime(date);

		 
		
	}
	public static void calendarToDate(){
		//月份的起始值为０而不是１，所以要设置八月时，我们用７而不是8
		Calendar cal=Calendar.getInstance();
		cal.set(2015, 3, 28, 15, 21, 10);
		cal.set(Calendar.MILLISECOND, 0);
		Date date=cal.getTime();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
		System.out.println(df.format(date));
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println(df1.format(date));
	}
	public static void dateTest(){
		Date dStart=new Date();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date dEnd=new Date();
		long x=dEnd.getTime()-dStart.getTime();
		System.out.println(x/1000);
	}

}
