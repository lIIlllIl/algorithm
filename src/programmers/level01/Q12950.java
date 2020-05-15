package programmers.level01;

public class Q12950 {
	// https://programmers.co.kr/learn/courses/30/lessons/12950
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
		// 이중 for문으로 각 행렬의 인덱스로 접근해 값을 구함 
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j]; 
            }
        }
        return answer;
    }
}
