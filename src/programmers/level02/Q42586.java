package programmers.level02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q42586 {
	// https://programmers.co.kr/learn/courses/30/lessons/42586
	
	// 첫 번째 방법 
	// int형 배열 date에 각 기능의 개발 완료 기간을 구함
	// 이중 for문으로 앞의 개발 완료 기간이 뒤의 개발 완료 기간보다 느릴 경우에 기능 배포 갯수 추가 
	/*
	public int[] solution(int[] progresses, int[] speeds) {
        int[] date = new int[speeds.length];
        
        for(int i = 0; i < date.length; i++) {
            progresses[i] = 100 - progresses[i];
            
            date[i] = progresses[i] / speeds[i];
            
            if(progresses[i] % speeds[i] != 0) {
                date[i]++;
            }
        }

        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        int count = 1;
        
        for(int i = 0; i < date.length; i++) {
            
            for(int j = i + 1; j < date.length; j++) {
                if(date[i] < date[j]) {
                    break;
                }
                else {
                    count++;
                }
            }
            
            answerList.add(count);
            i = i + count - 1;
            count = 1;
        }
        
        int[] answer = new int[answerList.size()];
        
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
    */
	
	// 두 번째 방법 
	// Math.ceil로 개발일자 계산 
	// LinkedList를 이용해 배포 갯수 계산 
	public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        
		int[] date = new int[speeds.length];
        
		for(int i=0; i<speeds.length;i++) {
			date[i] = (int) Math.ceil( (100-progresses[i]) / speeds[i] );
		}
		
		LinkedList<Integer> q = new LinkedList<>();
        
		for(int i=0; i<date.length;i++) {
			q.add(date[i]);
		}
		
		while(!q.isEmpty()) {
			int endDate = q.poll();
			int endTasks = 1;
			
			while(q.peek()!=null && endDate>=q.peek()) {
				q.poll();
				endTasks++;
			}
			
			answer.add(endTasks);
		}
	
		int[] aa = new int[answer.size()];
	        for(int i=0; i<answer.size();i++) {
	    	aa[i] = answer.get(i);
	    }
		    
		return aa;
    }
}
