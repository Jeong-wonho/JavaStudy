package com.day;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.FileSystem;
import java.util.ArrayList;

public class day_04_22 {

	public static void main(String[] args) {
//		ArrayList<String> list = null;
		String text = "helloworld_txt";
		File file = new File("D:\\JAVA_JWH\\Work\\day_04_22\\text\\t.txt");
		
		try {
			FileWriter writer = new FileWriter(file); //FileWriter는 file문 안에서만 사용한다.
			writer.write(text);
			writer.write(" ");
			writer.write(text);
			BufferedWriter w = new BufferedWriter(writer);
			w.close();
	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
//			System.out.println(System.err);
			// TODO: handle exception
		}finally {
			
		}
		System.out.println("도달");
	}

	static void list2() {
		// TODO Auto-generated method stub
		ArrayList<I> list = new ArrayList<I>();
		ArrayList<ArrayList<I>> list2 = new ArrayList<ArrayList<I>>();
		A a = new A();
		B b = new B();
		C c = new C();

		list.add(a);
		list.add(b);
		list.add(c);

		for (int i = 0; i < list.size(); i++) {
			ArrayList<I> list_a = new ArrayList<I>();
			for (int j = 0; j < list.get(i).getLength(); j++) {
				if (i == 0) {
					I a2 = new A(j);
					list_a.add(a2);
				} else if (i == 1) {
					I b2 = new B(j);
					list_a.add(b2);
				} else if (i == 2) {
					I c2 = new C(j);
					list_a.add(c2);
				}
			}
			list2.add(list_a);
//		I a2 = new A(i);
//		I b2 = new B(i);
//		I c2 = new C(i);
		}
		for (int i = 0; i < list2.size(); i++) {
			for (int j = 0; j < list2.get(i).size(); j++) {
				System.out.println(list2.get(i).get(j).getList());
			}
			System.out.println("========");
		}
	}
}
