//package com.day;
//
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
//public class Calendar_practice {
//	public static void main(String[] arg) {
//		String text = "hello world";
//		String path = "D:/JAVA_JWH/Work/day_04_26/Text/t.txt";
//		File file = new File(path);
//		
//		try (FileOutputStream output = new FileOutputStream(file)){
//			byte[] b = text.getBytes();
//			output.write(b);
//		}
//				
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}System.out.println("����");
//		
//		try (FileInputStream input = new FileInputStream(file)){
//			int n = 0;
//			System.out.println(input.available());
//			while ((n = input.available()) > 0) {
//				byte[] b2 = input.readAllBytes();
//				for (int i = 0; i < b2.length; i++) {
//					System.out.print((char)b2[i]);
//				}
//			}
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//static void Date_p() {
//	Date today = new Date();
//	
//	SimpleDateFormat sdf0, sdf1, sdf2, sdf3, sdf4;
//	SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
//	
//	sdf0 = new SimpleDateFormat("yyyyMMdd");
//	sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//	sdf2 = new SimpleDateFormat("yy�� MM�� dd�� E����");
//	sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//	sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
//	
//	sdf5 = new SimpleDateFormat("������ ������ D���� ���Դϴ�."); //���� ���° �� (1~ 366)
//	sdf6 = new SimpleDateFormat("������ ������ d���� ���Դϴ�."); //���� ���° �� (1~31)
//	sdf7 = new SimpleDateFormat("������ ������ w���� ���Դϴ�."); //���� ���° �� (1~53)
//	sdf8 = new SimpleDateFormat("������ ������ W���� ���Դϴ�."); //���� �° �� (1~5)
//	sdf9 = new SimpleDateFormat("������ ������ F���� E�����Դϴ�."); //���� ���° ����, ����
//
//	System.out.println(sdf0.format(today));
//	System.out.println(sdf1.format(today));
//	System.out.println(sdf2.format(today));
//	System.out.println(sdf3.format(today));
//	System.out.println(sdf4.format(today));
//	System.out.println(sdf5.format(today));
//	System.out.println(sdf6.format(today));
//	System.out.println(sdf7.format(today));
//	System.out.println(sdf8.format(today));
//	System.out.println(sdf9.format(today));
//}
//static void Calend() {
//	Calendar today  = Calendar.getInstance();
//	int year = today.get(Calendar.YEAR);
//	int month = today.get(Calendar.MONTH);
//	int date = today.get(Calendar.DATE);
//	
//	int woy = today.get(Calendar.WEEK_OF_YEAR);
//	int wom = today.get(Calendar.WEEK_OF_MONTH);
//	
//	int doy = today.get(Calendar.DAY_OF_YEAR);
//	int dom = today.get(Calendar.DAY_OF_MONTH);
//	int dow = today.get(Calendar.DAY_OF_WEEK);
//	
//	int hour12 = today.get(Calendar.HOUR);
//	int hour24 = today.get(Calendar.HOUR_OF_DAY);
//	int minute = today.get(Calendar.MINUTE);
//	int second = today.get(Calendar.SECOND);
//	
//	int milliSecond = today.get(Calendar.MILLISECOND);
//	int timeZone = today.get(Calendar.ZONE_OFFSET);
//	int lastDate = today.getActualMaximum(Calendar.DATE);
//	int firstDate = today.getActualMinimum(Calendar.DATE);
//	
//	System.out.printf("������ %d�� %d�� %d��\n", year, month+1, date);
//	System.out.println("������ ������"+woy+"°��, �̹�����"+wom+"°��."+date+"��");
//	System.out.println("������ �̹�������"+doy+"������, �̹� ����"+dom+"��. ������"+dow+"��(1:�Ͽ���)");
//	System.out.println("���� �ð��� " + hour12 +":"+ minute + ":"+ second +", 24�ð����� ǥ���ϸ� " + hour24+":"+ minute + ":"+ second);
//	System.out.println("������ " + year +"�� " + month+1 + "��" + date +"��");
//	System.out.println("1000���� 1�� (0~999): " + milliSecond);
//	System.out.println("timeZone (-12~+12): " + timeZone/(60*60*1000));
//	System.out.println("�� ���� ������ ��: " + lastDate);
//	System.out.println("�� ���� �� ��: " + firstDate);
//}
//}