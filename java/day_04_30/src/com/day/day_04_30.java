package com.day;

public class day_04_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadT t = new ThreadT();
		t.start(); //multiThread
		String path = "C:/Users/kosta/Desktop/coding/JAVA_JWH/Work/day_04_30/IMAGE/t.text"; //절대경로
		String path2 = "./day_04_30/IMAGE/t.text"; //상대경로
		
		
		
		System.out.println("종료");
		try	{
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("test");
		
	}

}
