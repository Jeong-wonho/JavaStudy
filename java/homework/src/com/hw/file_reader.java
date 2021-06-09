package com.hw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class file_reader {
	
	ArrayList<String> arr = new ArrayList<String>();
	file_reader() {
		
	}
	
	file_reader(String s){
		try {
			File file = new File("C:\\Users\\kosta\\Desktop\\coding\\JAVA_JWH\\Work\\homework\\text\\"+s);
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while((line = bufReader.readLine()) != null) {
				arr.add(line);
			}
			//.readLine()은 끝에 개행문자를 읽지 않는다.
			bufReader.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
