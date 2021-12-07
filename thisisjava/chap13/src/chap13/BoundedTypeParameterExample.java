package chap13;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		//String str = Util.comapre("a", "b");
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	}
}
