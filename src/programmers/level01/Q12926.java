package programmers.level01;

public class Q12926 {
	public String solution(String s, int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12926
		
		  // 첫 번째 방법 
		  // 아스키 코드를 사용 
	      /*
	      String answer = "";
	      
	      for(int i = 0; i < s.length(); i++) {
	          char c = s.charAt(i);
	          
	          if(65 <= c && c <= 90) {
	              c += n; 

	              if(c > 90) {
	                  c -= 26;
	              }
	              answer += (char)c;
	          }
	          else if(97 <= c && c <= 122) {
	              c += n;

	              if(c > 122) {
	                  c -= 26;
	              }
	              answer += (char)c; 
	          }
	          else {
	              answer += " ";
	          }
	      }

	      return answer;
	      */
	      
		  // 두 번째 방법 
		  // 아스키 코드를 사용, 오버플로우시 if문을 삭제 
	      /*
	      String answer = "";
	      
	      for(int i = 0; i < s.length(); i++) {
	          char c = s.charAt(i);
	          
	          if(65 <= c && c <= 90) {
	              c = (char)((c - 65 + n) % 26 + 65);  
	          }
	          else if(97 <= c && c <= 122) {
	              c = (char)((c - 97 + n) % 26 + 97);  
	          }
	          answer += c;
	      }
	        
	      return answer;
	      */
	      
		  // 세 번째 방법
		  // 문자형 그대로 사용, 오버플로우시 if문을 삭제 
	      String answer = "";
	      
	      for(int i = 0; i < s.length(); i++) {
	          char c = s.charAt(i); 
	          
	          if(Character.isLowerCase(c)) {
	              c = (char)((c - 'a' + n) % 26 + 'a');
	          }
	          else if(Character.isUpperCase(c)) {
	              c = (char)((c - 'A' + n) % 26 + 'A');
	          }
	          
	          answer += c;
	      }
	      
	      return answer;
	  }
}
