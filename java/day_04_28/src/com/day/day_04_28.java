package com.day;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class day_04_28 {

	public static void main(String[] args) {
		// add�� 120�� 1�� 12�� 10��ġ
		// TODO Auto-generated method stub
		ArrayList<String> calender = new ArrayList<String>();
		String path = "D:\\JAVA_JWH\\Work\\day_04_28\\Calendar";
		
	
		try {
			 
			
					
			for (int i = 0; i < 10; i++) {
				File file = new File(path + "\\calendar"+(2020+i)+"b.txt");
				FileWriter writer = new FileWriter(file, true);
				for (int j = 1; j < 13; j++) {
					calender.add(Calender_test.strCalender(2020+i, j));	
//					writer.write(calender.get(i*12+j-1));
				}
				}
//			System.out.println((int)(calender.size()/10));
		}catch(IOException e){
}
	}
}


