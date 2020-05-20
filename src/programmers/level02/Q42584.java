package programmers.level02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q42584 {
	// https://programmers.co.kr/learn/courses/30/lessons/42584
	
	public int[] solution(int[] prices) {
		// 첫 번째 방법 
		// queue로 해결 
		// queue에 주식가격을 저장한 뒤 queue가 없어질 때 까지 while문 동작 
		// while문 내의 for문으로 해당 주식가격 이후의 배열 요소를 비교해 시간 계산 
		/*
        LinkedList<Integer> queue = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 0; i < prices.length; i++) {
            queue.add(prices[i]);
        }
        
        int index = 1;
        
        while(!queue.isEmpty()) {
            int dummy = queue.poll();
            int count = 0;
            
            for(int i = index; i < prices.length; i++) {
                if(dummy <= prices[i]) {
                    count++;
                }
                else {
                    count++;
                    break;
                }
            }
            
            arrayList.add(count);
            
            index++;
        }

        return arrayList.stream().mapToInt(i -> i).toArray();
        */
		
		// 두 번째 방법
		// 이중 for문 사용 
		ArrayList<Integer> arr = new ArrayList<>();
		
        for(int i = 0; i < prices.length; i++) {
        	int time = 0;
        	boolean isFallen = false;
        	
        	for(int k = i + 1; k < prices.length; k++) {
        		time++;
        		
        		if( prices[i] > prices[k] ) {
        			arr.add(time);
        			
        			isFallen = true;
        			break;
        		}
        	}
        	if(!isFallen) {
        		arr.add(prices.length - i - 1);
        	}
        }
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = arr.get(i);
        }
        return answer;
    }
}
