package level1;

public class LottoExample {
	public static void main(String[] args) {
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		
		Lotto lt = new Lotto();
		int[] answer = lt.solution(lottos, win_nums);
		for (int an : answer) {
			System.out.print(an);
			System.out.println();
		}
	}
}
