package programmers.level01;

import java.util.ArrayList;
import java.util.Collections;

public class Q12910 {
	// https://programmers.co.kr/learn/courses/30/lessons/12910
	
	// 첫 번째 방법 
	// 배열 사용 
	/*
	public int[] solution(int[] arr, int divisor) {
        int[] answer = new int[arr.length];
        
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[index++] = arr[i];
            }
        }
        
        int[] r = new int[index];
        
        for(int i = 0; i < r.length; i++) {
            r[i] = answer[i];
        }
        
        Arrays.sort(r);
        
        if(index == 0) {
            r = new int[1];
            r[0] = -1;
        }
        
        return r;
    }
    */
	
	// 두 번째 방법
	// arraylist 사용 
	public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                a.add(arr[i]);
            }
        }
        
        if(a.size() == 0) {
            return new int[]{ -1 };
        }
        
        Collections.sort(a);
        
        int[] answer = new int[a.size()]; 
        
        for(int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
        }
        
        return answer;
    }
	
}
