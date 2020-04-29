package programmers.level01;

public class Q12928 {
	// https://programmers.co.kr/learn/courses/30/lessons/12928
		
	  public int solution(int n) {
	      int answer = 0;
	      // 첫 번째 방법
	      // n까지 for문을 돌려 약수를 찾음 
	      /*
	      for(int i = 1; i <= n; i++) {
	          if(n % i == 0) {
	              answer += i;
	          }
	      }
	      return answer;
	      */
	      
	      // 두 번째 방법
	      // 약수는 주어진 값의 / 2를 넘는 값을 가질 수 없음 
	      for(int i = 1; i <= n / 2; i++) {
	          if(n % i == 0) {
	              answer += i;
	          }
	      }
	      
	      return answer + n;
	  }
		
}
