package com.hw;

import java.util.Scanner;

public class day_0519_homework {
	public static void main(String[] args) {
		// 상근이는 설탕배달을 하는구나
		// 설탕을 정확하게 'N'kg을 배달해야한다.
		// 봉지에 담겨져있구나. 봉지1 = 3kg , 봉지2 = 5kg
		// 상근이는 최대한 적은 수의 봉지를 가지고 싶어한다.
		// ex(18kg 설탕을 배달해야 할때, 3kg봉지 6개를 가져가도 되지만, 5kg 3개 3kg 짜리 1개를 배달)
		// 상근이가 'N'kg을 배달할 때 몇개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오

		// N 3 ~ 5000 5천키로를 들다니 천하장사로구만

		// '만약 정확하게 Nkg을 만들 수 없다면 -1을 출력한다.

//		Scanner scan = new Scanner(System.in);

//		System.out.println("3~50000사이에 무게를 입력해주세요");
		file_reader file = new file_reader("weight.txt");
		int i = 0;
		
		while (i < file.arr.size()) {
			int idx = 0;
			int ans = 0;
			int count = 0;
			int n = Integer.parseInt(file.arr.get(i));
			System.out.println(i+"번째:"+n);
			int[] array = { 5, 3 };
			

			// 결국구하는건 봉지의 수네
			
//			System.out.println(i+"번째idx:"+idx);
			while (n != 0) {
				count = n / array[idx];
				System.out.println("계산후count:"+count);
				n -= count * array[idx];
				System.out.println("계산후n:"+n);
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