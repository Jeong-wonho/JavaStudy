package chap13;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("Hello");
		String str = box.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
	}
}
