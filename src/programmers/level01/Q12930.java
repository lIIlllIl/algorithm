package programmers.level01;

public class Q12930 {
	// https://programmers.co.kr/learn/courses/30/lessons/12930
	
	// toCharArray()로 주어진 문자열을 char array로 변경 
	// flag를 통해 toLowerCase() 메소드와 toUpperCase() 메소드로 필요한 문자열 생성 
	public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        char[] c = s.toCharArray();
        boolean flag = false;
        
        for(int i = 0; i < c.length; i++) {
            if(c[i] == ' ') {
                answer.append(" ");
                flag = false;
            }
            else {
                if(flag) {
                    answer.append(Character.toLowerCase(c[i]));
                    flag = false;
                }
                else {
                    answer.append(Character.toUpperCase(c[i]));
                    flag = true;
                }
            }
        }
        return answer.toString();
    }
}
