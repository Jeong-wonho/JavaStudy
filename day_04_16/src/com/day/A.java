package com.day;

import java.util.Comparator;

public class A implements Comparable<A> { // Comparable�� ����ָ� �˴ϴ�. ���ڼ�!�� �̿��ؼ� �������� �������� �����!
	
	
	public A() {
		super();
	}
	public A(int count, String str) {
		super();
		this.count = count;
		this.str = str;
	}
	
	
	
	
	int count;

	String str = ""; // string�� �ʱ�ȭ�� �����ָ� null ���� ����.
	
	@Override
	public int compareTo(A o) { // ������? �Լ�?
		return this.str.compareTo(o.str);
	}
	
//	@Override
//	public int compareTo(A o) { // ������? �Լ�?
//		return this.count - o.count;
//		if ((o.str.length() < this.str.length())||(o.count < this.count)) { //this �ٷ������� ���� ��. o�� �Ϸ� ���� ��.
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

