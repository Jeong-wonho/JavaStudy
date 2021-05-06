package com.day;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar_practice {
	public static void main(String[] arg) {
		String text = "hello world";
		String path = "D:/JAVA_JWH/Work/day_04_26/Text/t.txt";
		File file = new File(path);
		
		try (FileOutputStream output = new FileOutputStream(file)){
			byte[] b = text.getBytes();
			output.write(b);
		}
				
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}System.out.println("도달");
		
		try (FileInputStream input = new FileInputStream(file)){
			int n = 0;
			System.out.println(input.available());
			while ((n = input.available()) > 0) {
				byte[] b2 = input.readAllBytes();
				for (int i = 0; i < b2.length; i++) {
					System.out.print((char)b2[i]);
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
static void Date_p() {
	Date today = new Date();
	
	SimpleDateFormat sdf0, sdf1, sdf2, sdf3, sdf4;
	SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
	
	sdf0 = new SimpleDateFormat("yyyyMMdd");
	sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
	sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
	
	sdf5 = new SimpleDateFormat("오늘은 올해의 D번재 날입니다."); //년의 몇번째 일 (1~ 366)
	sdf6 = new SimpleDateFormat("오늘은 올해의 d번재 날입니다."); //월의 몇번째 일 (1~31)
	sdf7 = new SimpleDateFormat("오늘은 올해의 w번재 날입니다."); //년의 몇번째 주 (1~53)
	sdf8 = new SimpleDateFormat("오늘은 올해의 W번재 날입니다."); //월의 몇뻔째 주 (1~5)
	sdf9 = new SimpleDateFormat("오늘은 올해의 F번재 E요일입니다."); //월의 몇번째 요일, 요일

	System.out.println(sdf0.format(today));
	System.out.println(sdf1.format(today));
	System.out.println(sdf2.format(today));
	System.out.println(sdf3.format(today));
	System.out.println(sdf4.format(today));
	System.out.println(sdf5.format(today));
	System.out.println(sdf6.format(today));
	System.out.println(sdf7.format(today));
	System.out.println(sdf8.format(today));
	System.out.println(sdf9.format(today));
}
static void Calend() {
	Calendar today  = Calendar.getInstance();
	int year = today.get(Calendar.YEAR);
	int month = today.get(Calendar.MONTH);
	int date = today.get(Calendar.DATE);
	
	int woy = today.get(Calendar.WEEK_OF_YEAR);
	int wom = today.get(Calendar.WEEK_OF_MONTH);
	
	int doy = today.get(Calendar.DAY_OF_YEAR);
	int dom = today.get(Calendar.DAY_OF_MONTH);
	int dow = today.get(Calendar.DAY_OF_WEEK);
	
	int hour12 = today.get(Calendar.HOUR);
	int hour24 = today.get(Calendar.HOUR_OF_DAY);
	int minute = today.get(Calendar.MINUTE);
	int second = today.get(Calendar.SECOND);
	
	int milliSecond = today.get(Calendar.MILLISECOND);
	int timeZone = today.get(Calendar.ZONE_OFFSET);
	int lastDate = today.getActualMaximum(Calendar.DATE);
	int firstDate = today.getActualMinimum(Calendar.DATE);
	
	System.out.printf("오늘은 %d년 %d월 %d일\n", year, month+1, date);
	System.out.println("오늘은 올해의"+woy+"째주, 이번달의"+wom+"째주."+date+"일");
	System.out.println("오늘은 이번연도의"+doy+"일이자, 이번 달의"+dom+"일. 요일은"+dow+"일(1:일요일)");
	System.out.println("현재 시각은 " + hour12 +":"+ minute + ":"+ second +", 24시간으로 표현하면 " + hour24+":"+ minute + ":"+ second);
	System.out.println("오늘은 " + year +"년 " + month+1 + "월" + date +"일");
	System.out.println("1000분의 1초 (0~999): " + milliSecond);
	System.out.println("timeZone (-12~+12): " + timeZone/(60*60*1000));
	System.out.println("이 달의 마지막 날: " + lastDate);
	System.out.println("이 달의 찻 날: " + firstDate);
}
}