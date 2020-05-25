package programmers.level02;

import java.util.HashSet;

public class Q1845 {
	// https://programmers.co.kr/learn/courses/30/lessons/1845
	
	// 중복되지 않는 배열 요소를 구한 뒤 해당 배열의 길이가 큰지 주어진 배열 / 2의 값이 큰지 비교 
	// 두 값 중 큰 값이 정답 
	public int solution(int[] nums) {
		// 첫 번째 방법
		// arrayList 사용, contains로 중복 제거 
		/*
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        arrayList.add(nums[0]);
        
        for(int i = 1; i < nums.length; i++) {
            if( !arrayList.contains(nums[i]) ) {
                arrayList.add(nums[i]);
            }
        }
        
        return arrayList.size() > nums.length / 2 ? nums.length / 2 : arrayList.size();
        */
		
		// 두 번째 방법
		// 중복을 허용하지 않는 HashSet 사용 
		HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        
        return set.size() > nums.length / 2 ? nums.length / 2 : set.size();
	}
}
