package com.day;

import java.util.ArrayList;

public class gugudan_inner {
	//��� �ʵ� (����)
	//��� �޼���
	String[] array_string = new String[9];
	
	void test() {
//		System.out.println(count);
	}
	
	public gugudan_inner() { // ������
		// TODO Auto-generated constructor stub
	} 
	
	public gugudan_inner(int n) {
		for(int i = 1; i < 10; i++) {
			String s = (n +" * "+i+"="+ n*i)+"";
			array_string[i-1] = s;
			System.out.println(s);	
	}
	}
}
