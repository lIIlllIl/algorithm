package programmers.level01;

public class Q17681 {
	// https://programmers.co.kr/learn/courses/30/lessons/17681
	
	// 첫 번째 방법 
	// StringBuilder 사용 toBinaryString() 메소드를 통해 이진수로 변경한 뒤 while문으로 조건에 맞는
	// 배열 요소로 변환 
	/*
	public String[] solution(int n, int[] arr1, int[] arr2) {
	      
	      String[] answer = new String[n];
	      
	      for(int i = 0; i < n; i++) {
	          StringBuilder a1 = new StringBuilder(Integer.toBinaryString(arr1[i]));
	          StringBuilder a2 = new StringBuilder(Integer.toBinaryString(arr2[i]));
	          
	          while(a1.length() < n) {
	              a1.insert(0, "0");
	          }
	          
	          while(a2.length() < n) {
	              a2.insert(0, "0");
	          }
	          
	          StringBuilder a3 = new StringBuilder();
	          
	          for(int j = 0; j < n; j++) {
	              if( (a1.charAt(j) == '0') && (a2.charAt(j) == '0') ) {
	                  a3.append(" ");
	              }
	              else {
	                  a3.append("#");
	              }
	          }
	          
	          answer[i] = a3.toString();
	      }
	      
	      return answer;
	      
	  }
	  */
	  // 두 번째 방식 
	  // toBinaryString() 메소드에 비트연산을 이용해 조건에 맞는 요소 생성 
	  public String[] solution(int n, int[] arr1, int[] arr2) {
	      
	      String[] answer = new String[n];
	      
	      for(int i = 0; i < n; i++) {
	          answer[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i])).replace("0", " ").replace("1", "#"); 
	      }
	      
	      return answer;
	      
	  }
}
