package programmers.level01;

public class Q12919 {
	// https://programmers.co.kr/learn/courses/30/lessons/12919
	
	public String solution(String[] seoul) {
		// StringBuilder 사용 
        StringBuilder answer = new StringBuilder();
        
        answer.append("김서방은 ");
        
        for(int i = 0; i < seoul.length; i++) {
            if ( seoul[i].equals("Kim") ) {
                answer.append(i);
                break;
            }
        }
        
        answer.append("에 있다");
        
        return answer.toString();
    }
}
