package chap11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatetimeFormatExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter =
				DateTimeFormatter.ofPattern("yyyy 년 M월 d일 a h시 m분");
		String nowString = now.format(dateTimeFormatter);
		System.out.println(nowString);
	}
}
