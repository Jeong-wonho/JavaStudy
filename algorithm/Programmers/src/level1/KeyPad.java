package level1;

public class KeyPad {
	public String solution(int[] numbers, String hand) {
		int leftNumber = 10;
		int rightNumber = 12;

		String answer = "";
		for (int i : numbers) {
			if (i == 0) {
				i = 11;
			}
			if (i == 1 || i == 4 || i == 7) {
				leftNumber = i;
				answer += "L";
			} else if (i == 3 || i == 6 || i == 9) {
				rightNumber = i;
				answer += "R";
			} else {
				int mL = Math.abs(i - leftNumber);
				int mR = Math.abs(i - rightNumber);
				int dL = (mL / 3) + (mL % 3);
				int dR = (mR / 3) + (mR % 3);
				if (dL > dR) {
					answer += "R";
					rightNumber = i;
				} else if (dL < dR) {
					answer += "L";
					leftNumber = i;
				} else {
					if (hand == "left") {
						answer += "L";
						leftNumber = i;
					} else {
						answer += "R";
						rightNumber = i;
					}
				}
			}
		}
		return answer;
	}
}
