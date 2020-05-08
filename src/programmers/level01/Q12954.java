package programmers.level01;

public class Q12954 {
	// https://programmers.co.kr/learn/courses/30/lessons/12954
	// long 타입 array를 반환해야 하기 때문에 명시적 캐스팅으로 조건에 맞는 요소 생성 
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
	      
	      for(int i = 0; i < n; i++) {
	          answer[i] = (long)x * (i + 1);
	      }
	      
	      return answer;
	}
}
