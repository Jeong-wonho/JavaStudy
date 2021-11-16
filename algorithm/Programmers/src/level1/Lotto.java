package level1;

public class Lotto {
	public int[] solution(int[] lottos, int[] win_nums) {
		int correct = 0; //정답수
		int uncertainty = 0; // 알지 못하는 갯수
		int maxWinning = 0; // 최대 맞췃을 때의 수
		int minWinning = 0; // 최소 맞췃을 때의 수
		int maxRank = 0; //최대 랭크
		int minRank = 0; // 최소 랭크
		int [] answer = new int[2];
		for(int i = 0; i < lottos.length; i++) {
			if(lottos[i] == 0) {
				uncertainty++;
				continue;
			}
			
			for(int j = 0; j < win_nums.length; j++) {
				if(lottos[i] == win_nums[j]) {
					correct++;
				}
			}
		}
		maxWinning = (correct + uncertainty);
		minWinning = (correct);
		System.out.println(maxWinning);
		System.out.println(minWinning);
		switch (maxWinning){
		case 2:
			maxRank = 5;
			break;
		case 3:
			maxRank = 4;
			break;
		case 4:
			maxRank = 3;
			break;
		case 5:
			maxRank = 2;
			break;
		case 6:
			maxRank = 1;
			break;
		default:
			maxRank = 6;
			break;
		}
		
		switch(minWinning) {
		case 2:
			minRank = 5;
			break;
		case 3:
			minRank= 4;
			break;
		case 4:
			minRank = 3;
			break;
		case 5:
			minRank = 2;
			break;
		case 6:
			minRank = 1;
			break;
		default:
			minRank = 6;
			break;
		}
		 
		answer[0] = minRank;
		answer[1] = maxRank;
		
		return answer;
	}
}
