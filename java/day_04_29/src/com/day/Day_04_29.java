package com.day;

public class Day_04_29 {

	public static void main(String[] args) {
		
		Thread threadA=new ThreadA(30);
		Thread threadB=new ThreadA(100);
		threadA.start();
		threadB.start();

		System.out.println("작업종료");
//		threadA.start();
//		threadB.start();
	}
}
