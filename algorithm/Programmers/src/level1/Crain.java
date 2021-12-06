package level1;

import java.util.ArrayList;

public class Crain {
	public static void main(String[] args) {
		int[][] boards = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },{ 3, 5, 1, 3, 1 } };
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(crain(boards, moves));
	}

	public static int crain(int[][] boards, int[] moves) {
		int answer = 0 ;
		ArrayList<Integer> result = new ArrayList<Integer>();
		boolean temp = true;
		for (int i = 0; i < moves.length; i++) {
			temp  = true;
			for (int j = 0; j < boards.length; j++) {
				if (boards[j][moves[i] - 1] != 0 && temp) {
					result.add(boards[j][moves[i] - 1]);
					System.out.print("baords값:" + boards[j][moves[i]-1]+",  ");
					boards[j][moves[i] - 1] = 0;
					temp = false;
//					break;
				}
			}
		
			for (int j2 = 1; j2 < result.size(); j2++) {
				if(result.get(j2-1) == result.get(j2) && result.size() > 1) {
					answer += 2;
//					System.out.println("j2:"+result.get(j2));
					result.remove(result.get(j2));
//					System.out.println("j2-i:"+result.get(j2-1));
					result.remove(result.get(j2-1));
				}
			}
		}
		return answer;
	}
}
