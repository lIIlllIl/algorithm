package programmers.level02;

import java.util.Stack;

public class Q42588 {
	// https://programmers.co.kr/learn/courses/30/lessons/42588
	
	public int[] solution(int[] heights) {
        // 첫 번째 방법 
        // 이중 for문 사용 
        /*
        int[] answer = new int[heights.length];
        
        for(int i = 1; i < heights.length; i++) {
            for(int j = heights.length - 1 - i; j >= 0; j--) {
                if(heights[heights.length - i] < heights[j]) {
                    answer[heights.length - i] = j + 1;
                    break;
                }
                
            }
        }
        
        return answer;
        */
		
		// 두 번째 방법
		// 스택 사용
		// 탑의 높이와 인덱스를 가지는 배열을 스택에 저장하고 기준과 비교대상을 비교해 비교 대상이 기준보다 작을 시, 
		// 즉 기준이 되는 탑에서 전송한 신호를 수신할 수 없을 시 스택에서 제거, 수신할 수 있을 시 스택에 그대로 저장 
		int[] answer = new int[heights.length];
		
        Stack<Integer[]> stack = new Stack<Integer[]>();
        
        for(int i = 0; i < heights.length; i++) {
            int index = 0;
            
            while(!stack.isEmpty()) {
                Integer[] stackArray = stack.peek();
                
                if(stackArray[0] > heights[i]) {
                    index = stackArray[1] + 1;
                    break;
                }
                
                stack.pop();
            }
            
            answer[i] = index;
            stack.push(new Integer[] {heights[i], i});
        }
        
        return answer;
    }
}
