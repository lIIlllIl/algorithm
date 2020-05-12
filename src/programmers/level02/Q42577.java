package programmers.level02;

import java.util.Arrays;

public class Q42577 {
	// https://programmers.co.kr/learn/courses/30/lessons/42577
	
	// Arrays.sort로 사전순으로 정렬 후 startsWith() 메소드로 접두사 확인 
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
        for(int i = 1; i < phone_book.length; i++) {
            if ( phone_book[i].startsWith(phone_book[i - 1]) ) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}

