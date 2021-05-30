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
		
		String text = "홍기동/이수홍/박연수";
		
		//how1 : 전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
				
		System.out.println();
		
		//how2:남아 있는 토큰을 확인하고 while문으로 루핑
		st = new StringTokenizer(text, "/");
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
