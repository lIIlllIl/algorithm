package programmers.level02;

import java.util.Arrays;

public class Q42747 {
	// https://programmers.co.kr/learn/courses/30/lessons/42747
	public int solution(int[] citations) {
        int answer = 0;

        // 오름차순 정렬
        Arrays.sort(citations);

        // citations 길이만큼 for문 
        for(int i = 0; i < citations.length; i++) {
        // H-Index의 조건은 h번 이상 인용된 논문이 전체 논문 중 h편 이상일 경우 
        // H-Index를 만족하는 논문의 수는 최대값(논문 전체 수)으로부터 낮아지며 
        // 인용 횟수는 최소값(0)으로부터 높아짐 

        	
        	if( citations[i] >= citations.length - i) {
    		// citations 배열은 해당 인덱스의 요소가 논문이 인용된 횟수이므로 
        	// 논문이 인용된 횟수 >= 논문 전체 수 - 반복한 횟수로 구할 수 있음 
        	// 오름차순 정렬했으므로 첫 번째로 해당 if문을 만족하는 요소가 답 
        		answer = citations.length - i;
        		break;
        	}
        }
        
        return answer;
    }

}
