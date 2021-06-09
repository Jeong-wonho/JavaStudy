package com.day;

import java.util.Scanner;

public class day_04_08 {

	public static void main(String[] args) {
		// while 문을 사용해서 구구단
		int i = 1;
//		int j = 0; // j값이 다시 초기화 된다.
		while(i < 9) {
			i ++;
			int j = 0;
			//j ++;
			while(j < 9) {
				j ++;
				System.out.printf("%d*%d = %d\n", i, j, i*j );
			}
			System.out.println("================");
		}
		
	}

	// 항상 빨간 줄 제거가 최우선이다.
	static void gugudan2(int m) {
		if (m < 10)
			m = 10;
		else if (m > 21)
			m = 20;
		System.out.println(m);
		int max = m;
		for (int i = 2; i < max; i++) {
			gugudan_0(i);
			System.out.println("--------------");

		}
	}

// 
	
	static void gugudan_0(int i) {
		
		for (int j = 1; j < 10 || j < i+1; j++) {
//		System.out.print(i + "*" + j + "=" + j * i + "\t");
			System.out.printf("%2d * %2d = %-8d", i, j, i * j);
			}
	}
	
	static void gugudan_1(int i) {
		
		int m = i < 9 ? 9 : i; // 삼항연산자 = m < 9 ? 9 : i; 
		for (int j = 1; j < m+1; j++) {
//		System.out.print(i + "*" + j + "=" + j * i + "\t");
			System.out.printf("%2d * %2d = %-8d", i, j, i * j);}
			}
	
	static void gugudan(int i) {
		
		int m = i;
		if (m < 10)
			m = 9;
		for (int j = 1; j < m+1; j++) {
//		System.out.print(i + "*" + j + "=" + j * i + "\t");
			System.out.printf("%2d * %2d = %-8d", i, j, i * j);
			}
		
//		if (i < 10) {
//			for (int j = 1; j < 10; j++) {
////			System.out.print(i + "*" + j + "=" + j * i + "\t");
//				System.out.printf("%2d * %2d = %-8d", i, j, i * j);
//			
//		} else if (i > 9) {
//			for (int j = 1; j < i+1; j++) {
////				System.out.print(i + "*" + j + "=" + j * i + "\t");
//				System.out.printf("%2d * %2d = %-8d", i, j, i * j);
//			}
//		}
	}
	static void scanner_while() {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in); // new는 연산자 Scanner 는 생성자(매개변수)
				// 생성자는 함수 만드는 원리와 똑같다.
				int c = 0;
				while (c > -100) {
				//while 보통 max값을 알 수 없을때 많이 사용한다.
					
					System.out.println("숫자를 입력하세요");
					c = sc.nextInt();
					
//					if(c == -100)
//						break;
					
					gugudan2(c);
				}
				do {
					System.out.println("반복문 탈출 성공");
				} while (false);
				// 무조건 한 번은 실행한다.
				System.out.println("do 와일문 나왔습니다.");
				sc.close();
	}
}