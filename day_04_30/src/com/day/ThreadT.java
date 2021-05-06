package com.day;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ThreadT extends Thread{
	
	public void run() {
		
		System.out.println("ThreadT 이전출력");
		String text = "Hello world";
		String path = "C:/Users/kosta/Desktop/coding/JAVA_JWH/Work/day_04_30/IMAGE/t.text"; //절대경로
		String path2 = ""; //상대경로
		
		File file = null;
		FileWriter writer = null;
		BufferedWriter w = null;
		for (int i = 0; i < 100; i++) {
			try {
				path2 = "./IMAGES_"+i;
				file = new File(path2);
				System.out.println(file.exists());
				if(file.exists()) {
					
				}else {
					file.mkdir();
				}
				
				path2 = "./IMAGES_"+i+"/t.txt";
				file = new File(path2);
				writer = new FileWriter(file);
				writer.write(text);
				w =  new BufferedWriter(writer);
				w.close();
				Thread.sleep(500);
				System.out.println(i);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("ThreadT 이후출력");
	}
	
	
}
