package com.day;

import java.util.Scanner;

public class day_04_08 {

	public static void main(String[] args) {
		// while ���� ����ؼ� ������
		int i = 1;
//		int j = 0; // j���� �ٽ� �ʱ�ȭ �ȴ�.
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

	// �׻� ���� �� ���Ű� �ֿ켱�̴�.
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
		
		int m = i < 9 ? 9 : i; // ���׿����� = m < 9 ? 9 : i; 
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
				Scanner sc = new Scanner(System.in); // new�� ������ Scanner �� ������(�Ű�����)
				// �����ڴ� �Լ� ����� ������ �Ȱ���.
				int c = 0;
				while (c > -100) {
				//while ���� max���� �� �� ������ ���� ����Ѵ�.
					
					System.out.println("���ڸ� �Է��ϼ���");
					c = sc.nextInt();
					
//					if(c == -100)
//						break;
					
					gugudan2(c);
				}
				do {
					System.out.println("�ݺ��� Ż�� ����");
				} while (false);
				// ������ �� ���� �����Ѵ�.
				System.out.println("do ���Ϲ� ���Խ��ϴ�.");
				sc.close();
	}
}