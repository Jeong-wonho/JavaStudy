package com.hw;

import java.util.Scanner;

public class day_0519_homework {
	public static void main(String[] args) {
		// ����̴� ��������� �ϴ±���
		// ������ ��Ȯ�ϰ� 'N'kg�� ����ؾ��Ѵ�.
		// ������ ������ֱ���. ����1 = 3kg , ����2 = 5kg
		// ����̴� �ִ��� ���� ���� ������ ������ �;��Ѵ�.
		// ex(18kg ������ ����ؾ� �Ҷ�, 3kg���� 6���� �������� ������, 5kg 3�� 3kg ¥�� 1���� ���)
		// ����̰� 'N'kg�� ����� �� ��� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�

		// N 3 ~ 5000 5õŰ�θ� ��ٴ� õ�����α���

		// '���� ��Ȯ�ϰ� Nkg�� ���� �� ���ٸ� -1�� ����Ѵ�.

//		Scanner scan = new Scanner(System.in);

//		System.out.println("3~50000���̿� ���Ը� �Է����ּ���");
		file_reader file = new file_reader("weight.txt");
		int i = 0;
		
		while (i < file.arr.size()) {
			int idx = 0;
			int ans = 0;
			int count = 0;
			int n = Integer.parseInt(file.arr.get(i));
			System.out.println(i+"��°:"+n);
			int[] array = { 5, 3 };
			

			// �ᱹ���ϴ°� ������ ����
			
//			System.out.println(i+"��°idx:"+idx);
			while (n != 0) {
				count = n / array[idx];
				System.out.println("�����count:"+count);
				n -= count * array[idx];
				System.out.println("�����n:"+n);
				ans += count;
				
				if(n==0) {
					System.out.println("ans:"+ans);
				}else if(n<3 & n>0) {
					System.out.println(-1);
					n =0; 
				}
				idx++;
				
//				System.out.println("idx:"+idx);
			}
			
//			System.out.println("n:"+n);
			i++;
			
		}
		
	}
}