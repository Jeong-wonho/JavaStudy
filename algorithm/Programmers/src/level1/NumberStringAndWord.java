package level1;

import java.util.HashMap;

public class NumberStringAndWord {
	    public int solution(String s) {
	    	int answer = 0;
	    	String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	    	for(int i = 0; i < s.length(); i++) {
	    		s = s.replaceAll(word[i],  i + "");
	    	}
	    	answer = Integer.parseInt(s);
	    	return answer;
	    }
	}
