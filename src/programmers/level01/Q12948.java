package programmers.level01;

public class Q12948 {
	// https://programmers.co.kr/learn/courses/30/lessons/12948
	public String solution(String phone_number) {
		// 첫 번째 방법 
		// phone_number.length() - 4만큼 for문을 돌려 문자열 생성 
		/*
		StringBuilder answer = new StringBuilder();
		int i = 0;
		
		for(i = 0; i < phone_number.length() - 4; i++) {
		    answer.append("*");    
		}
		
		return answer.append(phone_number.substring(i)).toString();
	    */
		// 두 번째 방법 
		// toCharArray()로 char 배열을 만든 뒤 배열 요소를 phone_number.length() - 4만큼 *로 치환
		char[] c = phone_number.toCharArray();
		
		for(int i = 0; i < phone_number.length() - 4; i++) {
		     c[i] = '*';
		}
		
		return String.valueOf(c);
	}
}
