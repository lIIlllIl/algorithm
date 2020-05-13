package programmers.level02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q42578 {
	// https://programmers.co.kr/learn/courses/30/lessons/42578
	public int solution(String[][] clothes) {
		// a, b, c의 세 가지 방법 중 모든 경우의 수를 구하는 공식 : (a + 1) * (b + 1) * (c + 1) 
		// 해당 문제의 경우 스파이는 한 가지 이상의 의복을 입어야 하므로 (a + 1) * (b + 1) * (c + 1) - 1 
		
		// 첫 번째 방법
		// HashMap의 key로 의상 종류를 선택해 의상 종류가 겹치면 기존의 key : value의 value값 1 증가
		// 의상 종류가 겹치지 않으면 새로운 key : value로 해당 의상 종류와 1 생성 
		// Iterator로 HashMap의 모든 value값을 추출한 뒤 while문으로 해당 Iterator의 값이 존재하지 않을 때 까지 
		// value값을 추출해 모든 경우의 수를 구함 
		/*
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < clothes.length; i++) {
            if(map.get(clothes[i][1]) == null) {
                map.put(clothes[i][1], 1);
                continue;
            }
            map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
        }
        
        Iterator<Integer> it = map.values().iterator();
        
        while(it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }

        return answer - 1;
        */
		
		// 두 번째 방법 
		// Iterator 대신 enhanced for loop 사용 
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < clothes.length; i++) {
            if(map.get(clothes[i][1]) == null) {
                map.put(clothes[i][1], 1);
                continue;
            }
            map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
        }

        for(String keys : map.keySet()) {
            answer *= map.get(keys) + 1;
        }
        
        return answer - 1;
    }	
}
