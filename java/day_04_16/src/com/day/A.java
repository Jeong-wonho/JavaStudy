package com.day;

import java.util.Comparator;

public class A implements Comparable<A> { // Comparable로 잡아주면 됩니다. 글자수!를 이용해서 오름차순 내림차순 만들기!
	
	
	public A() {
		super();
	}
	public A(int count, String str) {
		super();
		this.count = count;
		this.str = str;
	}
	
	
	
	
	int count;

	String str = ""; // string은 초기화를 안해주면 null 값이 들어간다.
	
	@Override
	public int compareTo(A o) { // 생성자? 함수?
		return this.str.compareTo(o.str);
	}
	
//	@Override
//	public int compareTo(A o) { // 생성자? 함수?
//		return this.count - o.count;
//		if ((o.str.length() < this.str.length())||(o.count < this.count)) { //this 바로직전에 넣은 감. o는 하루 지난 값.
//			System.out.println("true:"+this.count);
//			return 1;
//		} else if ((o.str.length() > this.str.length()||(o.count > this.count))) {
//			
//			System.out.println("true 1:"+ this.count);
//			return -1;
//		}
//		else
//			return this.str.compareTo(o.str);
//	}

//	public int compartTo(A o) {
//		if(o.count < this.count) {
//		return 1;
//	}else
//		return -1;
//}
		
//	
//	}
}

