package programmers.level01;

import java.util.Arrays;
import java.util.Comparator;

public class Q12915 {
	public String[] solution(String[] strings, int n) {
		// https://programmers.co.kr/learn/courses/30/lessons/12915
		
		// 첫 번째 방법 
		// 주어진 String array의 n번째 글자를 맨 앞글자로 추가한 뒤 
		// Arrays.sort()로 정렬 
        /*
        for(int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(strings);
        
        for(int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }
        
        return strings;
        */
        
		
		
		// 두 번째 방법 
		// Arrays.sort()에서 Comparator을 이용해 사용자 정의 정렬 사용 
		/*
		Arrays.sort(strings, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if(s1.charAt(n) > s2.charAt(n)) {
                    return 1;
                }
                else if(s1.charAt(n) == s2.charAt(n)) {
                    return s1.compareTo(s2); 
                }
                else if(s1.charAt(n) < s2.charAt(n)) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
            
            return strings;
        });
		*/
		
        // 세 번째 방법 
		// 두 번째 방법 리펙토링, 음수일 경우에만 수가 바뀌도록 if문 수정 
        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String s1, String s2) {
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n); 
                
                if(c1 == c2) {
                    return s1.compareTo(s2);
                }
                else {
                    return c1 - c2; 
                }
            }
        });
            
        return strings;
    }
}
