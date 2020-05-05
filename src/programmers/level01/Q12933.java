package programmers.level01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Q12933 {
	// https://programmers.co.kr/learn/courses/30/lessons/12933
	// 첫 번째 방법
	// Comparator 직접 구현
	/*
	public long solution(long n) {
	      long answer = 0;
	      
	      String[] a = String.valueOf(n).split("");
	      Arrays.sort(a, new Comparator<String>() {
	          public int compare(String s1, String s2) {
	              char c1 = s1.charAt(0);
	              char c2 = s2.charAt(0);
	              
	              return c2 - c1;
	          }
	      });
	      
	      for(String s : a) {
	          answer *= 10;
	          answer += Integer.parseInt(s); 
	      } 
	      return answer;
	  }
	  */
	
	// 두 번째 방법
	// Collections.reverseOrder() 메소드로 내림차순 정렬 
	public long solution(long n) {
      String[] s = String.valueOf(n).split("");
      
      Arrays.sort(s, Collections.reverseOrder());
      
      StringBuilder answer = new StringBuilder();
      for(String a : s) {
          answer.append(a); 
      }
      
      return Long.parseLong(answer.toString());
   }
}
