package com.day;

import java.util.StringTokenizer;

public class day_05_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		nullpointerexception
//		String data = null;
//		System.out.println(data.toString());
		
//		arrayindexoutofboundsexception
//		String data1 = args[0];
//		String data2 = args[1];
//		
//		System.out.println("args[0]"+data1);
//		System.out.println("args[0]"+data2);+++
		
		String text = "ȫ�⵿/�̼�ȫ/�ڿ���";
		
		//how1 : ��ü ��ū ���� ��� for������ ����
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
				
		System.out.println();
		
		//how2:���� �ִ� ��ū�� Ȯ���ϰ� while������ ����
		st = new StringTokenizer(text, "/");
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
