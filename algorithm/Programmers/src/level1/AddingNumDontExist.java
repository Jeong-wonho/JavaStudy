package level1;

import java.util.Iterator;

public class AddingNumDontExist {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0};
		System.out.println(solution(numbers));
	}

	public static int solution(int[] numbers) {
		int answer = 0;
		for(int number:numbers) {
			answer += number;
		}
		return 45 - answer;
	}
}
