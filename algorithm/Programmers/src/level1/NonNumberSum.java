package level1;

import java.util.Arrays;

public class NonNumberSum {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		solution(numbers);
	}

	public static int solution(int[] numbers) {
		int[] ten = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int num : numbers) {
			int index = Arrays.binarySearch(ten, num);
			System.out.println(index);
		}
		return 0;
	}
}
