package com.day;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class day_04_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\JAVA_JWH\\Work\\day_04_23\\text\\A.txt");
		try {
//			FileReader reader = new FileReader(file);
//			int c = reader.read();
//			BufferedReader r = new BufferedReader(reader);
//			int c = r.read();
//			System.out.println((char)c);
//			String rc = r.readLine();
//			String rc2 = r.readLine();
//			String rc3 = r.readLine();
//			System.out.println(rc);
//			System.out.println(rc2);
//			System.out.println(rc3);
			file = new File("D:\\JAVA_JWH\\Work\\day_04_23\\text\\text_0.txt");
			FileReader reader = new FileReader(file);
			BufferedReader r = new BufferedReader(reader);
			int i = 0;
			String line = "";
//			while((i = r.read())!= -1) {
//				System.out.print((char)(i));
//			}
			
			while((line = r.readLine()) != null) {
				
				System.out.println(line);
				
			}
			reader.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	public void write() {
		ArrayList<String> list = new ArrayList<String>();
		A a = new A();
		B b = new B();
		C c = new C();

		list.add(a.getattr());
		list.add(b.getattr());
		list.add(c.getattr());
		
		File file = null;
		String test = "";
//		System.out.println(list.get(1));
		try {
			FileWriter writer = null;
			BufferedWriter w = null;
			for (int i = 0; i < 3; i++) {
				file = new File("D:\\JAVA_JWH\\Work\\day_04_23\\text\\"+(char)(i+65)+".txt");
				writer = new FileWriter(file);
				writer.write(list.get(i));
				w = new BufferedWriter(writer);
				w.close();
				}
			test = "정상적으로 처리되었습니다.";
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
			test = "오류가 발생하였습니다: 내용보기 =>" + e.getMessage();
		} finally {
			System.out.println(test);

		}
	}
	}

