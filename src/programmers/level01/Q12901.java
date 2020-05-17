package programmers.level01;

import java.util.Calendar;

public class Q12901 {
	// https://programmers.co.kr/learn/courses/30/lessons/12901
	
	public String solution(int a, int b) {
		  // Calendar를 사용하여 계산 
	      String answer = "";

	      Calendar input = Calendar.getInstance();
	      input.set(2016, (a - 1), b);

	      switch( input.get(Calendar.DAY_OF_WEEK) - 1 ) {
	        case 0 :
	          answer = "SUN";
	          break;
	              
	        case 1 :
	          answer = "MON";
	          break;
	              
	        case 2 :
	          answer = "TUE";
	          break;
	              
	        case 3 :
	          answer = "WED";
	          break;
	              
	        case 4 :
	          answer = "THU";
	          break;
	              
	        case 5 :
	          answer = "FRI";
	          break;
	              
	        case 6 :
	          answer = "SAT";
	          break;
	      }
	      
	      
	      
	      return answer;
	  }
}
