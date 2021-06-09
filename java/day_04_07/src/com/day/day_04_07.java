package com.day;

import java.util.Iterator;

public class day_04_07 {

	public static void main(String[] args) {

		// 반복문
		// 메서드를 만들어 매개변수에 인자를 5 넣으면 5단만 출력하기
		// 19단 출력하되 인자로 14라고 입력하면 14단 까지 출력이 되야함.
		// 메서드를 만드는데 인자값 9~19까지만 받는다.
//		for(int i = 2; i<20; i++) {
//			multi(i);
//			System.out.println("========");
//		}
		gugudan(0);
		gugudan(80);

	}

	static void num(int s) {
		int nums = s;
		int sum = 0;
		switch (s) {
		case 1:
			sum += s;
			s++;

		case 2:
			sum += s;
			s++;

		case 3:
			sum += s;
			s++;

		case 4:
			sum += s;
			s++;

		case 5:
			sum += s;
			s++;
		case 6:
			sum += s;
			s++;
		case 7:
			sum += s;
			s++;
		case 8:
			sum += s;
			s++;
		case 9:
			sum += s;
			s++;
		case 10:
			sum += s;
			s++;
			break;
		default:
			System.out.println("숫자를 잘 못 입력하셨습니다. 1~10사이로 다시 입력해주세요.");
			return;

		}
		System.out.printf("%d부터 %d까지의 합은:%d", nums, s - 1, sum);
	}

	static void sum_v(int s) {
		int sum = 0;
		switch (s) {
		case 0:
			System.out.println(s);

		case 1:
			sum = sum + s;
			s++;

		case 2:
			sum = sum + s;
			s++;

		case 3:
			sum = sum + s;
			s++;

		case 4:
			sum = sum + s;
			s++;

		case 5:
			sum = sum + s;
			s++;
		case 6:
			sum = sum + s;
			s++;
		case 7:
			sum = sum + s;
			s++;
		case 8:
			sum = sum + s;
			s++;
		case 9:
			sum = sum + s;
			s++;
		case 10:
			sum = sum + s;
			s++;

		}
		System.out.println("total:" + sum);
	}

	static int sum_i(int s) {
		int sum = 0;
		switch (s) {
		case 0:
			System.out.println(s);

		case 1:
			sum = sum + s;
			s++;

		case 2:
			sum = sum + s;
			s++;

		case 3:
			sum = sum + s;
			s++;

		case 4:
			sum = sum + s;
			s++;

		case 5:
			sum = sum + s;
			s++;
		case 6:
			sum = sum + s;
			s++;
		case 7:
			sum = sum + s;
			s++;
		case 8:
			sum = sum + s;
			s++;
		case 9:
			sum = sum + s;
			s++;
		case 10:
			sum = sum + s;
			s++;

		}
		// System.out.println(sum);
		return sum;
	}

	static void test2() {

		int c = 0;
		int d = 3;
		switch (c) {
		case 0:
			System.out.println("switch 첫번째");
			switch (d) { // switch 문은 int만 가능하다.
			case 3:
				System.out.println("스위치문 안에 스위치문");
				if (d == 3) {
					System.out.println("안에서");
					break; // break는 if문에서 의미가 없다.
				}
				System.out.println("안에서 확인");
			case 2:
				System.out.println("들어왓니?");
				break;
			}
//			break;
			System.out.println("확인");
		case 1:

			System.out.println("또확인");
			break;
		case 2:
			System.out.println("또또확인");
			break;
		case 3:
			break;
		case 4:
			break;
		}
		System.out.println("그래도 확인");
	}

	static void multi(int n) {
		for (int i = 1; i < 10; i++) {
			System.out.println(n + "*" + i + "=" + i * n);
		}
	}

	static void gugudan(int m) {
		if (m < 9) {
			m = 9;
		} else if (m > 19) {
			m = 19;
		}
		for (int i = 2; i <= m; i++) {
			multi(i);
			System.out.println("========");
		}
	}

}
