package programmers.level01;

public class Q12940 {
	// https://programmers.co.kr/learn/courses/30/lessons/12940
	
	// 최대공약수의 경우 유클리드 호제법으로 재귀적으로 처리
	// 최소공배수의 경우 두 수의 곱을 최대공약수로 나눈 값 
	public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        else {
            return gcd(y, x % y);
        }
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m); 
        answer[1] = n * m / answer[0];
        return answer;
    }
	
}
