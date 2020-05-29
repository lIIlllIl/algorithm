package programmers.level02;

public class Q12899 {
	// https://programmers.co.kr/learn/courses/30/lessons/12899
	public String solution(int n) {
		// 1, 2, 4 세 개의 숫자로 모든 수를 표현한다는 것은 3진수로 모든 숫자를 표현하되 숫자만 1, 2, 4로 표현한다는 의미
		// n이 0이 될 때 까지 3으로 나눠주면서 나머지에 따라 1, 2, 4를 추가 
		// StringBuilder의 reverse() 메소드를 통해 알맞은 순서로 반환 
        StringBuilder answer = new StringBuilder();
        
        while(n > 0) {
            if(n % 3 == 0) {
                answer.append("4");
                n--;
            }
            else if(n % 3 == 1) {
                answer.append("1");
            }
            else {
                answer.append("2");
            }
            
            n /= 3;
        }
        
        return answer.reverse().toString();
    }
}
