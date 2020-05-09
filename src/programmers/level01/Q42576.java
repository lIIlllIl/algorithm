package programmers.level01;

import java.util.Arrays;

public class Q42576 {
	// https://programmers.co.kr/learn/courses/30/lessons/42576
	
		// 두 배열을 오름차순 정렬 후 서로 비교해 이름이 같지 않은 경우 해당 순번의 참가자 배열이 실패한 선수
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        Arrays.sort(participant);
	        Arrays.sort(completion);

	        for (int i = 0; i < completion.length; i++) {
	            if ( ! completion[i].equals( participant[i] ) ) { 
	                answer = participant[i];
	                return answer;
	            }
	        } 
	        answer = participant[completion.length];
	        
	        return answer;
	    }
}
