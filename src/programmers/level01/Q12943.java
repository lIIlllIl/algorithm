package programmers.level01;

public class Q12943 {
	// https://programmers.co.kr/learn/courses/30/lessons/12943
	
	// 첫 번째 방법 
	// while문 조건을 통해 반복문을 제한 
	// else문 오류를 해결하기 위해 받은 int num을 long number로 받음 
	/*
	public int solution(int num) {
        int answer = 0;
        long number = num;
        
        while(number != 1 && answer < 500) {    
            
            if(number % 2 == 0) {
                number = number / 2;
            }    
            else {
                number = (number * 3) + 1;
            }
            answer++;
        }
        
        if(answer == 500) {
            return -1;
        }
        
        return answer;
    }
	*/
	
	// 두 번째 방법
	// 삼항연산자 사용 
	public int solution(int num) {
        int answer = 0;
        long number = num;
        
        while(number != 1 && answer < 500) {    
        	number = (number % 2 == 0) ? (number / 2) : (number * 3 + 1);
        	
            answer++;
        }
        
        if(answer == 500) {
            return -1;
        }
        
        return answer;
    }
}
