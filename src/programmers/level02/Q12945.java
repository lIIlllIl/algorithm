package programmers.level02;

public class Q12945 {
	// https://programmers.co.kr/learn/courses/30/lessons/12945
	
	public int solution(int n) {
        // 재귀호출 사용 시 시간초과
		// 배열을 생성해 처리 
        int[] num = new int[n + 1];
        
        num[0] = 0;
        num[1] = 1;
        num[2] = 1;
        
        for(int i = 3; i <= n; i++) {
            num[i] = ( num[i - 1] + num[i - 2] ) % 1234567;
        }
        
        return num[n];
    }
}
