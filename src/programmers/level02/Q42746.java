package programmers.level02;

import java.util.Arrays;
import java.util.Comparator;

public class Q42746 {
	// https://programmers.co.kr/learn/courses/30/lessons/42746
	
	public String solution(int[] numbers) {
		// 주어진 수를 문자열 연산 방식으로 계산하여 최댓값을 찾아야 하므로
		// Comparator에서 s1 + s2와 s2 + s1을 계산 
		// 내람차순이므로 매개변수의 순서를 바꿔 (s2 + s1).compareTo(s1 + s2)
        String[] change = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            change[i] = Integer.toString(numbers[i]);                       
        }

        Arrays.sort(change, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            } 
        });
        
        StringBuilder answer = new StringBuilder();
        
        for(String s : change) {
            answer.append(s);
        }
        
        return answer.toString().startsWith("0") ? "0" : answer.toString();
    }
}
