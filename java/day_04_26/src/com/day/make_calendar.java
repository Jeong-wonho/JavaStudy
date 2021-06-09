package com.day;

import java.util.Scanner;

public class make_calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 0;
		int month = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		year = scan.nextInt();

		System.out.println("달을 입력하세요");
		month = scan.nextInt();

		String[] strweek = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(year + "년도" + month + "월");

		for (String week : strweek) {
			System.out.print(week + "\t");
		}

		int total = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
//		윤달
		int[] lastDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			lastDay[1] = 29;
		else
			lastDay[1] = 28;

		for (int i = 0; i < month - 1; i++) {
			total += lastDay[i];
		}
		total++;

		int week = total % 7;

		System.out.println();
		for (int i = 1; i <= lastDay[month - 1]; i++) {
			if (i == 1)
			{
				for (int j = 0; j < week; j++) {
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t", i);
			week++;
			if (week > 6) {
				week = 0;
				System.out.println();
			}
		}

	}
}
