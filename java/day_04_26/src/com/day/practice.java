package com.day;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		Date dt = new Date();
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		
		String text = "yyyy-mm-dd";
		SimpleDateFormat sdf0 = new SimpleDateFormat(text);
		System.out.println(sdf0.format(dt));
		
		File file = new File("D:/JAVA_JWH/day_04_26/Text/tot.txt");
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
