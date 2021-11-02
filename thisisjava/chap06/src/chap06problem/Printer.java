package chap06problem;

public class Printer {
	
	//작성위치, (오버로딩) 문제구먼
	public static void println(int i) {
		System.out.println(i);
	}
	
	public static void println(double d) {
		System.out.println(d);
	}

	public static void println(boolean b) {
		System.out.println(b);
	}
	
	public static void println(String s) {
		System.out.println(s);
	}
}
