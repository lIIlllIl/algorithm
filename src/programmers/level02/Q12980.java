package programmers.level02;

public class Q12980 {
	// https://programmers.co.kr/learn/courses/30/lessons/12980
	// 목표 거리부터 0까지로 계산 (n ~ 0) 
	public int solution(int n) {
		// 첫 번째 방법
		// 홀수일 경우 점프를 해서 짝수로 맞춤 
		// 홀수를 나눌 시 나머지는 고려하지 않음 
        /*
        int ans = 0;
        
        while(n > 0) {
            if(n % 2 != 0) {
                ans++;
            }
            
            n /= 2;
        }
        
        return ans;
        */
		
		// 두 번째 방법
		// n ~ 0이므로 n을 이진수로 변환한 뒤 변환한 결과의 1의 개수만큼 점프 
		return Integer.bitCount(n);
    }
}
