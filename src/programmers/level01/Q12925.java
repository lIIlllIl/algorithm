package programmers.level01;

public class Q12925 {
	public int solution(String s) {
		// https://programmers.co.kr/learn/courses/30/lessons/12925
		
		  // 첫 번째 방법
		  // Integer.parseInt() 메소드 사용 
		  /*
	      return Integer.parseInt(s);
	      */
	      
		  // 두 번째 방법
		  // Integer.parseInt() 구현 
		  // 부호 유무를 파악해 계산 
	      int answer = 0;
	      
	      boolean flag = false;
	      for(int i = 0; i < s.length(); i++) {
	          char piece = s.charAt(i); 
	          
	          if(piece == '-') {
	              flag = true;
	          }
	          else if(piece != '+') {
	              answer = answer * 10 + (piece - '0');
	          }
	          else {
	              continue;
	          }
	      }
	      
	      return flag ? answer * - 1 : answer;
	      
	  }
}
