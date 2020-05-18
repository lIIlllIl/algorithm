package programmers.level01;

public class Q12947 {
	// https://programmers.co.kr/learn/courses/30/lessons/12947
	
	public boolean solution(int x) {
		// 첫 번째 방법
		// while문을 통해 모든 자릿수의 숫자를 더함
		/*
        boolean answer = true;
        
        int sum = 0;
        int divide = x;
        
        while(x > 0) {
            sum += (x % 10); 
            
            x /= 10;
        }
        
        if( divide % sum != 0 ) {
            answer = false;
        }
        
        return answer;
        */
		// 두 번째 방법
		// 주어진 숫자를 char[]로 변환한 뒤 연산 
		char[] charArr = String.valueOf(x).toCharArray();
        int divisor = 0;

        for (char c : charArr) {
            divisor += (int) c - 48; 
        }

        return (x % divisor == 0);
    }
}
