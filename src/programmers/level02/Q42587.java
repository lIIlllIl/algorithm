package programmers.level02;

import java.util.Arrays;
import java.util.LinkedList;

public class Q42587 {
	// https://programmers.co.kr/learn/courses/30/lessons/42587
	public int solution(int[] priorities, int location) {
		// 큐를 이용해 지정한 문서(location)이 출력될 때 까지
		// 이전에 인쇄한 문서의 수량(answer)를 증가시켜 지정한 문서를 구함
        int answer = 0;

        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }

        Arrays.sort(priorities); 
        int length = priorities.length - 1; 

        while(!queue.isEmpty()){
            int dummy = queue.poll();

            if(dummy == priorities[length - answer]){
                answer++;
                location--;
                if(location < 0){
                    break;
                }
            }
            else {
                queue.add(dummy);
                location--;
                if(location < 0){
                    location = queue.size() - 1;
                }
            }
        }
        
        return answer;
    }
}
