package chap10;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("클래스가 존재 하지 않습니다.");
		}
	}
}
