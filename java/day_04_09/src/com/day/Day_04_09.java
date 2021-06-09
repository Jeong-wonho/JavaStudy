package com.day;

public class Day_04_09 {

	public static void main(String[] args) {

		int a = 3;
		int b = 7;
		int c = 11;
		int d = 100;
		int e = 2;
		int f = 300;
		int[] lotto = new int[45];

//		int[] array_int = {a, b, c, d, e,f};
		int[] array_int = new int[6]; // new 연산자 시험에 나올 수 있다, 대용량 처리엔 new를 사용하는 것이 좋다.
		array_int[0] = a;
		array_int[1] = b;
		array_int[2] = c;
		array_int[3] = d;
		array_int[4] = e;
		array_int[5] = f; // ex) 주소 값이 정해지면, 물건을 넣을 수 있다
		// 변수 abcdef는 literal값을 가지고 있기 때문에 위에처럼 array[i] 별로 입력 할 수 있다.

// 		int[] array_int2 = null;
// 		array_int2 = new int[] {2,3,4,5,6};
// 		System.out.println(array_int2);
// 		array_int2 = new int[6];
// 		System.out.println(array_int2); // 사용하는 장소가 두개가 다르다.!
		int[] array_int2 = new int[100];

// 		for (int i = 0; i < array_int2.length; i++) {
// 			array_int2[i] = array_int2.length-i;
// 			System.out.println(array_int2[i]);
// 		}

		for (int i = array_int2.length; i > -1; i--) {
//			System.out.println(i);
		}

		int[] array_int3 = new int[100];
		for (int i = 0; i < array_int3.length; i++) {
//			array_int3[i] = (int)(Math.random()*100);
		}
		for (int i = 0; i < array_int3.length; i++) {
//			System.out.println(array_int3[i]);
		}

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		for (int i = 0; i < 10000; i++) {
			int r = (int) (Math.random() * 44) + 1; // index는 나오면 안된다.
//			if(i<6)
//			System.out.println(lotto[r]);
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
//			System.out.println(lotto[r]);
//			System.out.println(r);
//			if(r == 45) {
//				System.out.println("test");
//			}
		}
		int[] sorted = new int[6];
		for (int j = 0; j < 6; j++) {
//			System.out.println("i:" + j + ":" + lotto[j]);
			sorted[j] = lotto[j];
		}
		for (int i = 0; i < sorted.length; i++) {
			for(int j = i+1; j < sorted.length; j++)
			{if(sorted[i] < sorted[j]) {
				int temp = sorted[i];
				sorted[i] = sorted[j];
				sorted[j] = temp;
				
			}
				}
			}
		
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i]);
		}
//		int r = (int)(Math.random()*100); // (int)명시적형변환
//		System.out.println(r);

	}

	static void test() {
		int a = 5;
		int b = 6; // a = b 는 b값을 a에 저장하는 것이다.
		int c = 11;

		int[] array_int = new int[10]; // 사용하기 전에 크기가 정해진다.
		System.out.println(array_int); // f가 보이면 16진수라는 뜻이다.
		for (int i = 0; i < array_int.length; i++) {
			if (i == 5)
				continue;
			array_int[i] = i * 100;
			System.out.println(array_int[i]);
		}

		int[] array_a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // a와 b는 기본적으로 같음.
		int[] array_b = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] array_c = null; // 변수만 선언해 줄때
//		System.out.println(array_int);

		if (a < b) {

			int temp = a;
//			System.out.println(temp);
			a = b;
			b = temp;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println("====================");
			if (b < c) {
				int temp2 = b;
				b = c;
				c = temp2;
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println("====================");
				if (a < b) {
					int temp3 = a;
					a = b;
					b = temp3;

					System.out.println("a :" + a);
					System.out.println("b :" + b);
					System.out.println("c :" + c);
					System.out.println("====================");
				}
			}

		} else {
			int temp2 = b;
			b = c;
			c = temp2;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

	}

	static void array_a() {
		int a = 3;
		int b = 6;
		int c = 11;
		int d = 100;
		int e = 2;
		int f = 300;

		int[] array_int = new int[] { a, b, c, d, e, f }; // null 이후에 new int[]를 반드시 해줘야 한다.!
		// for문 하나로는 정렬을 할 수 없어.!
		for (int i = 0; i < array_int.length; i++) {
			for (int j = 1 + i; j < array_int.length; j++) { // 1+i 가 정확하게 잘이해가 안되네;;;
				if (array_int[i] <= array_int[j]) {
					int temp = array_int[i];
					array_int[i] = array_int[j];
					array_int[j] = temp;

				}
			}

		}

		for (int i = 0; i < array_int.length; i++) {
			System.out.println(array_int[i]);
		}
	}

}
