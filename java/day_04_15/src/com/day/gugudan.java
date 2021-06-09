package com.day;

import java.util.ArrayList;

public class gugudan {
	// 이 자리에서 객체를 저장합니다.
	
	ArrayList<gugudan_inner> list = new ArrayList<gugudan_inner>(); //앞에 있는게 타입이다.
	
	
	
	public void gugudan_method() {
		for (int i = 2; i < 10; i++) {
//			gugudan_inner gugudan = new gugudan_inner(i);
//			
//			gugudan.count= 100;
//			gugudan.test();
//			list.add(gugudan);
//			System.out.println(list.size());
	}
		System.out.println(list.size());
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
}
	public void gugudan_method(int c, int j) {
		for (int i = c; i < j+1; i++) {
			gugudan_inner gugudan = new gugudan_inner(i);
			
			list.add(gugudan);
//			System.out.println(list.size());
		}
//		System.out.println(list.size());
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
		}
	}
	
//}
