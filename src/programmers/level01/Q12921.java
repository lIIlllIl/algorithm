package programmers.level01;

import java.util.ArrayList;

public class Q12921 {
	class Solution {
	  public int solution(int n) {
		  // https://programmers.co.kr/learn/courses/30/lessons/12921
		  
		  // 첫 번째 방법 
		  // 숫자 n을 2부터 n - 1의 수로 나누는 방식 
		  // 효율성에서 실패 
	      /*
	      int answer = 0;
	      
	      for(int i = 3; i <= n; i++) {
	        for(int j = 2; j < i; i++) {
	            if(i % j == 0) {
	                break;
	            }
	            if(j == (i - 1) {
	                answer++;
	            }
	        }
	      }
	      
	      return answer;
	      /*
	      
	      // 두 번째 방법 
	      // arraylist에 소수를 담아 n을 소수로만 나누는 방식 
	      // 효율성에서 실패, 동작 시간이 첫 번째 방법보다 1/4로 줄어듦
	      /*
	      ArrayList<Integer> a = new ArrayList<Integer>();
	      a.add(2);

	      int size = 0;
	      for(int i = 3; (n % 2 != 0) ? i <= n : i < n; i += 2) {
	          size = a.size();
	          for(int j = 0; j < size; j++) {
	              if(i % a.get(j) == 0) {
	                  break;
	              }
	              
	              if(j == (size - 1)) {
	                  a.add(i);
	              }
	              
	          }
	          
	      }
	      
	      return a.size();
	      */
	      
		  // 세 번째 방법 
	      // arraylist에 소수를 담아 n을 소수로만 나누는 방식 
		  // 플래그 사용 
		  // 효율성에서 실패, 두 번째 방법보다 약 100 ~ 200ms 줄어듦 
	      /*
	      ArrayList<Integer> a = new ArrayList<Integer>();
	      a.add(2);

	      for(int i = 3; (n % 2 != 0) ? i <= n : i < n; i += 2) {
	          boolean flag = true;
	          for(int j = 0; j < a.size(); j++) {
	              if(i % a.get(j) == 0) {
	                  flag = false;
	                  break;
	              }
	          }
	          if(flag == true) {
	              a.add(i);
	          }
	      }
	      
	      return a.size();
	      */
	      
		  // 네 번째 방법 
		  // 숫자 n을 제곱근까지만 나누는 방식 
		  // 동작시간 최대 300ms
	      /*
	      int answer = 0;
	      
	      for(int i = 2; i <= n; i++) {
	          boolean flag = true;
	          for(int j = 2; j*j <= i; j++) {
	              if(i % j == 0) {
	                  flag = false;
	                  break;
	              }
	          }
	          if(flag) {
	              answer++;
	          }
	      }
	      return answer;
	      */
	      
		  // 다섯 번째 방법
		  // 에라토스테네스의 체 
		  // 소수의 배수를 제거하는 방식 
		  // 동작시간 최대 20ms 
	      int answer = 0;
	      
	      int[] number = new int[n + 1];
	      
	      for(int i = 2; i <= n; i++) {
	          number[i] = i;
	      }
	      
	      for(int i = 2; i <= n; i++) {
	          if(number[i] == 0) {
	              continue;
	          }
	          
	          for(int j = 2 * i; j <= n; j += i) {
	              number[j] = 0;
	          }
	      }
	      
	      for(int i = 0; i < number.length; i++) {
	          if(number[i] != 0) {
	              answer++;
	          }
	      }
	      
	      return answer;
	  }
	}
}
