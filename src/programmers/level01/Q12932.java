package programmers.level01;

public class Q12932 {
	// https://programmers.co.kr/learn/courses/30/lessons/12932
	// 첫 번째 방법
	// 주어진 정수의 자릿수를 구하기 위해 Math.log10() 메소드 사용 
	/*
	public int[] solution(long n) {
	      int length = (int)(Math.log10(n) + 1);
	      int[] answer = new int[length];
	      
	      for(int i = 0; i < length; i++) {
	          answer[i] = (int)(n % 10);
	          n /= 10;
	      }
	      
	      return answer;
	}
	*/
	// 두 번째 방법 
	// 주어진 정수의 자릿수를 구하기 위해 String으로 변환 후 변환된 String의 길이 측정 
	/*
	public int[] solution(long n) {
	      int length = (String.valueOf(n)).length();
	      int[] answer = new int[length];
	      
	      for(int i = 0; i < length; i++) {
	          answer[i] = (int)(n % 10);
	          n /= 10;
	      }
	      
	      return answer;
	}
	*/
	
	// 세 번째 방법 
	// StringBuilder의 reverse() 함수를 사용해 순서를 뒤바꾼 String을 split으로 String 배열 생성 
	public int[] solution(long n) {
	      String[] s = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
	      int[] answer = new int[s.length];
	      
	      for(int i = 0; i < answer.length; i++) {
	          answer[i] = Integer.parseInt(s[i]);
	      }
	      
	      return answer;
	}
	
	
}
