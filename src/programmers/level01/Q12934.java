package programmers.level01;

public class Q12934 {
	// https://programmers.co.kr/learn/courses/30/lessons/12934
	
	// Math.sqrt 및 Math.pow 사용 
	public long solution(long n) {
	      return ( Math.pow( (int)Math.sqrt(n), 2) == n ) ? (long) Math.pow( Math.sqrt(n) + 1, 2) : -1; 
	  }
}
