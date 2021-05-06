package com.day;
class test implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("test");
	}
	

}

public class day_05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		t.run();
	}
	

}
