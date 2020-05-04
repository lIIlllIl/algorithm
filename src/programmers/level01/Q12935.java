package programmers.level01;

public class Q12935 {
	// https://programmers.co.kr/learn/courses/30/lessons/12935
	
	// int min에 최소값을 담아 해당 구간을 제외한 나머지 요소를 새로운 배열에 저장 
	public int[] solution(int[] arr) {
	      
	      if(arr.length <= 1) {
	          return new int[]{ -1 };
	      }
	      
	      int min = arr[0];

	      for(int i = 1; i < arr.length; i++) {
	          if(min > arr[i]) {
	              min = arr[i];
	          }
	      }
	      
	      int[] answer = new int[arr.length - 1];
	      int index = 0;
	      
	      for(int i = 0; i < arr.length; i++) {
	          if(arr[i] == min) {
	              continue;
	          }
	          answer[index++] = arr[i];
	      }
	      
	      return answer;
	  }
}
