package chap13;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
	}
}
