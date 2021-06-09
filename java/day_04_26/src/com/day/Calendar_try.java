package com.day;

import java.util.Calendar;

public class Calendar_try {

	public static void main(String[] arg) {

		Calendar cal = Calendar.getInstance();

		// 1~12월
		for (int month = 0; month < 12; month++) {

			cal.set(Calendar.MONTH, month);
			System.out.println(cal.get(Calendar.MONTH) + 1 + "월");

			// 월의 마지막날 저장
			int maxday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			cal.set(Calendar.DATE, 1);
			
			for(int i = 1; i<=maxday; i++) {
				cal.set(Calendar.DATE, i);
				int wom1 = cal.get(Calendar.WEEK_OF_MONTH);
				System.out.print(cal.get(Calendar.DATE) + " ");
				
				cal.set(Calendar.DATE, i + 1);
				int wom2 = cal.get(Calendar.WEEK_OF_MONTH);
				
				if(wom1 != wom2) {
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}
