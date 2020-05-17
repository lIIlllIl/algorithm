package programmers.level01;

import java.util.Arrays;

public class Q42676 {
	// https://programmers.co.kr/learn/courses/30/lessons/42576
	
	public String solution(String[] participant, String[] completion) {
		// 두 개의 배열을 오름차순 정렬하여 서로 비교 
		// 단 한 명만이 완주에 실패했으므로 그 한 명을 제외한 모든 사람은 완주함
		// 즉 participant와 completion은 단 한 개의 요소를 제외하고 모두 같음 
		// 두 배열을 비교할 때 participant 배열과 completion 배열 요소가 서로 다를 때의 participant 요소가 정답
		// for문이 통과한 경우 completion의 길이만큼 for문을 반복했기 때문에 participant의 마지막 요소가 정답
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
