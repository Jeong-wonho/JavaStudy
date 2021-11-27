package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class FailRatio {
	public int[] solution(int N, int[] stages) {
        int nonClear = 0;
        int reachAnswer = 0;
        double failRatio = 0.0;
        HashMap<Integer, Double> ratioRank = new HashMap<Integer, Double>();
		int[] answer = {};
		List<Double> mapValue = new ArrayList<>();
        for (int i = 0; i < N; i++) {
			for (int j = 0; j < stages.length; j++) {
				if(i == stages[j]) {
					nonClear++;
					continue;
				}
				if(i < stages[j]) {
					reachAnswer++;
				}
			}
			failRatio = nonClear/reachAnswer;
			ratioRank.put(i, failRatio);
		}
       //value로 정렬
        for (int i = 0; i < stages.length; i++) {
        	mapValue.add(ratioRank.get(i));
		}
        
        
        return answer;
    }
}
