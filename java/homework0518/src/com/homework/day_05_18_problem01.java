package com.homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class day_05_18_problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. ù°�� A�� �迭 ũ�� n, B�� �迭 ũ�� m 1 <= n,m <=1,000,000
		 * 2. ��°�ٿ��� A�� ������, ��°�ٿ��� B�� ������ ����. [2�߹迭?]
		 * 3. �迭�� ����ִ� ���� ���밪�� 10���� �۰ų� ���� ����
		 */
		
		// merge
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�迭�� ũ�� n,m�� �Է��ϼ���!");
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		// nũ��, mũ�⸸ŭ��, a,b �迭 ����!
		int[] size = {n, m};
		int[] a = new int[n];
		int[] b = new int[m];
		int[] result = new int[n+m];

		
		//�迭 ũ�⸦ ���� ����!

		
		System.out.print("a�� ũ��:" + size[0]+"\t");
		System.out.println("b�� ũ��:" + size[1]);
			
		//a �迭�� �����غ���.!
		for (int i = 0; i < n-1; i++) {
			//������ ���밪
			int num = (int) ((int)10*Math.random());
			a[i] = num;
			System.out.print("a"+i+"�� ��:"+ a[i]+"\t");
		}
		Arrays.sort(a);
		
		System.out.println();
		
		//b �迭�� �����غ���.!
		for (int i = 0; i < m-1; i++) {
			//������ ���밪
			int num = (int) ((int)10*Math.random());
			b[i] = num;
			System.out.print("b"+i+"�� ��:" + b[i]+"\t");
		}
		Arrays.sort(b);
		System.out.println();
		//merge �غ���.
		int a1 = 0;
		int b1 = 0;
		int r = 0;
		
		while(a1<n && b1<m) {
			if(a[a1]>b[b1]) {
				result[r++] = b[b1++];
			}
			else {
				result[r++] = a[a1++];
			}
		}
		Arrays.sort(result);
		
		for(int r1:result) {
			System.out.print("result�迭:"+r1+"\t");
		}
		
		
	}

}
