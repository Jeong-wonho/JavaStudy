package com.day;

import java.util.Iterator;

public class day_04_07 {

	public static void main(String[] args) {

		// �ݺ���
		// �޼��带 ����� �Ű������� ���ڸ� 5 ������ 5�ܸ� ����ϱ�
		// 19�� ����ϵ� ���ڷ� 14��� �Է��ϸ� 14�� ���� ����� �Ǿ���.
		// �޼��带 ����µ� ���ڰ� 9~19������ �޴´�.
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
			System.out.println("���ڸ� �� �� �Է��ϼ̽��ϴ�. 1~10���̷� �ٽ� �Է����ּ���.");
			return;

		}
		System.out.printf("%d���� %d������ ����:%d", nums, s - 1, sum);
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
			System.out.println("switch ù��°");
			switch (d) { // switch ���� int�� �����ϴ�.
			case 3:
				System.out.println("����ġ�� �ȿ� ����ġ��");
				if (d == 3) {
					System.out.println("�ȿ���");
					break; // break�� if������ �ǹ̰� ����.
				}
				System.out.println("�ȿ��� Ȯ��");
			case 2:
				System.out.println("���Ӵ�?");
				break;
			}
//			break;
			System.out.println("Ȯ��");
		case 1:

			System.out.println("��Ȯ��");
			break;
		case 2:
			System.out.println("�Ƕ�Ȯ��");
			break;
		case 3:
			break;
		case 4:
			break;
		}
		System.out.println("�׷��� Ȯ��");
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
