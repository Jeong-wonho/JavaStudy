package level1;

public class KeyPadExample {
	public static void main(String[] args) {
		String hand = "left";
		int[] numbers = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };

		KeyPad kp = new KeyPad();
		String kpSolution = kp.solution(numbers, hand);
		System.out.println(kpSolution);
	}

}
