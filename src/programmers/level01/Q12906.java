package programmers.level01;

import java.util.ArrayList;

public class Q12906 {
	// https://programmers.co.kr/learn/courses/30/lessons/12906
	
	public int[] solution(int[] arr) {
		// ArrayList 사용 
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        arrayList.add(arr[0]);
        
        for(int i = 0; i < arr.length; i++) {
            if ( !arrayList.get(arrayList.size() - 1).equals(arr[i]) ) {
                arrayList.add(arr[i]);
            }
        }
        
        int[] answer = new int[arrayList.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
        
        return answer;
    }
}
