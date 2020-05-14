package programmers.level01;

public class Q12931 {
	// https://programmers.co.kr/learn/courses/30/lessons/12931
	public int solution(int n) {
		// n % 10으로 일의 자리 숫자를 더한 뒤 n / 10으로 다음번 자릿수를 구함 
        int answer = 0;
        
        while(n > 0) {
            answer += (n % 10);
            
            n /= 10;
        }
        
        return answer;
    }
}
