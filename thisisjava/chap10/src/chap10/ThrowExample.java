package chap10;

public class ThrowExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
