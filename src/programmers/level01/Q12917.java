package programmers.level01;

import java.util.Arrays;
import java.util.Collections;

public class Q12917 {
	// https://programmers.co.kr/learn/courses/30/lessons/12917
    public String solution(String s) {
    	// 첫 번째 방법
    	// Collections.reverseOrder() 메소드로 내림차순 정렬 
        /*
        String[] a = s.split("");
        
        Arrays.sort(a, Collections.reverseOrder());
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < a.length; i++) {
            answer.append(a[i]);
        }

        return answer.toString();
        */
        
    	// 두 번째 방법 
    	// toCharArray() 메소드를 통해 char 배열을 만든 뒤 StringBuilder의 reverse() 메소드로 순서를 반전
        char[] answer = s.toCharArray();
        Arrays.sort(answer);
        return new StringBuilder(new String(answer)).reverse().toString();
    }
	
}
