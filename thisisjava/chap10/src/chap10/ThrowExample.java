package chap10;

public class ThrowExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
