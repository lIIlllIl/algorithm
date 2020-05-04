package programmers.level01;

import java.util.Arrays;

public class Q12982 {
	// https://programmers.co.kr/learn/courses/30/lessons/12982
	
	// Arrays.sort()를 통해 정렬한 뒤 물품이 작은 부서부터 구매 
	public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++) {
            if(budget >= d[i]) {
                answer++; 
                budget -= d[i];
            }
            else {
                break;
            }
        }
        
        
        return answer;
    }
}
