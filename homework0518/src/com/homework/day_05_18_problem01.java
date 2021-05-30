package com.homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class day_05_18_problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 첫째줄 A의 배열 크기 n, B의 배열 크기 m 1 <= n,m <=1,000,000
		 * 2. 둘째줄에는 A의 내용이, 셋째줄에는 B의 내용이 들어간다. [2중배열?]
		 * 3. 배열에 들어있는 수는 절대값이 10보다 작거나 같은 정수
		 */
		
		// merge
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열의 크기 n,m을 입력하세요!");
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		// n크기, m크기만큼의, a,b 배열 생성!
		int[] size = {n, m};
		int[] a = new int[n];
		int[] b = new int[m];
		int[] result = new int[n+m];

		
		//배열 크기를 집어 넣자!

		
		System.out.print("a의 크기:" + size[0]+"\t");
		System.out.println("b의 크기:" + size[1]);
			
		//a 배열을 생성해보자.!
		for (int i = 0; i < n-1; i++) {
			//임의의 절대값
			int num = (int) ((int)10*Math.random());
			a[i] = num;
			System.out.print("a"+i+"의 값:"+ a[i]+"\t");
		}
		Arrays.sort(a);
		
		System.out.println();
		
		//b 배열을 생성해보자.!
		for (int i = 0; i < m-1; i++) {
			//임의의 절대값
			int num = (int) ((int)10*Math.random());
			b[i] = num;
			System.out.print("b"+i+"의 값:" + b[i]+"\t");
		}
		Arrays.sort(b);
		System.out.println();
		//merge 해보자.
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
			System.out.print("result배열:"+r1+"\t");
		}
		
		
	}

}
