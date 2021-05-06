package com.day;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class day_04_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance(); //주소값을 고정시켜서 사용하기위해 getInstance()라는 함수를 사용하였다.
		
//		System.out.println(calendar.get(Calendar.YEAR));
//		System.out.println(calendar.get(Calendar.MONTH)+1);
//		System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
//		System.out.println(calendar.get(Calendar.DATE));
//		System.out.println(calendar.get(Calendar.HOUR));
//		System.out.println(calendar.get(Calendar.MINUTE));
//		System.out.println(calendar.get(Calendar.SECOND));
		
		
		

//		System.out.println(datedata);
		
		String path = "D:\\JAVA_JWH\\Work\\day_04_26\\Text\\time.txt";
		File file = new File(path);
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter(file));
			for (int j = 0; j < 5; j++) {
				Date date = new Date();
				String foramat = "YYY / MM /  dd // HH:mm:ss";
				SimpleDateFormat s = new SimpleDateFormat(foramat);
				String datedata = s.format(date.getTime());
				System.out.println(datedata);
				System.out.println(j);
				System.out.println("이전");
				Thread.sleep(2000);
				System.out.println("이후");
				w.write(datedata);
				w.write("\n");
			} w.close();
				
			
			
		}catch(Exception e) {
			e.getStackTrace();
	}
//		Thread test = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for (int i = 0; i < 10; i++) {
//					try {
//						
//					} catch (Exception e) {
//						// TODO: handle exception
//					}
//					System.out.println("Thread"+i);
//				}
//				
//			}
//			
//		});
//		test.run();
//		System.out.println(test.getName());
//		Thread test0 = new Thread();
//		System.out.println(test0.getName());
//		Thread test1 = new Thread();
//		System.out.println(test1.getName());
//		
	
	
	}
	
	static void file_text() {
		
		String text = "hello world";
		String path = "D:\\JAVA_JWH\\Work\\day_04_26\\Text\\t.text";
		File file = new File(text);
		
		try {
			FileWriter writer = new FileWriter(file);
			writer.write(text);
			writer.write(text);
			BufferedWriter w = new BufferedWriter(writer);
			w.close();
			System.out.println("test");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			FileReader reader = new FileReader(file);
			BufferedReader r = new BufferedReader(reader);
			System.out.println((char)r.read());
			System.out.println(r.readLine());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	static void file_text2() {
		String text = "helloworld";
		String path = "D:\\JAVA_JWH\\Work\\day_04_26\\Text\\t.txt";
		String path2 = "D:\\JAVA_JWH\\Work\\day_04_26\\Text\\t2.txt";
		File file = new File(path);
		File file2 = new File(path2);
		try {
			
			FileOutputStream output = new FileOutputStream(file);
			byte[] b = text.getBytes();  
			
			output.write(b);
			output.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
		try {
			FileInputStream input = new FileInputStream(file);
//			System.out.println(input.available());
//			System.out.println((char)input.read());
//			System.out.println(input.available());
			int n = 0;
//			String s = "";
			FileOutputStream output2 = new FileOutputStream(file2);
			
			while((n = input.available()) > 0) {
				byte[] b2 = input.readAllBytes();
				output2.write(b2);
				for (int i = 0; i < b2.length; i++) {
					System.out.println((char)b2[i]);
				}
				
			}
//			byte[] b2 = s.getBytes();
//			output2.write(b2);
//			output2.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
		
		System.out.println("도달");
	}
}