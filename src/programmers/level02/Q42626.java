package programmers.level02;

import java.util.PriorityQueue;

public class Q42626 {
	// https://programmers.co.kr/learn/courses/30/lessons/42626
	
	public int solution(int[] scoville, int K) {
		// 요소 추가 시 정렬해주는 PriorityQueue 사용
        int answer = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        
        for(int i = 0; i < scoville.length; i++) {
            heap.offer(scoville[i]);
        }
        
        while(heap.peek() < K) {
            if(heap.size() <= 1) {
                return -1;
            }
            
            int a = heap.poll();
            int b = heap.poll();
            
            heap.offer( a + (b * 2) );
            answer++;
        }
        
        return answer;
    }
}
