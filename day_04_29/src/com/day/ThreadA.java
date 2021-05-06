package com.day;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class ThreadA extends Thread{

	int c;
	public ThreadA(int c) {
		this.c=c;

	}
	
	@Override
	public void run() {
		ArrayList<String> calender=new ArrayList<String>();
		try {
			for(int i=2000;i<2000+c;i++) {
				
				File file=new File("C:\\JAVA_JWH\\Work\\day_04_29\\Calender\\"+i+".txt");
				if(file.exists()) {
					break;
				}else {
				FileWriter writer=new FileWriter(file);
				BufferedWriter w=new BufferedWriter(writer);
				for(int j=1;j<13;j++) {
					Calender_test.printCalender(i, j);
					calender.add(Calender_test.strCalender(i, j));
					writer.write(calender.get((i-2000)*12+j-1));
					writer.write("\n");

					}w.close();
				}
			}
		System.out.println();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(c+"작업종료");
	}

}
