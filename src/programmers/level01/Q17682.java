package programmers.level01;

public class Q17682 {
	// https://programmers.co.kr/learn/courses/30/lessons/17682
	
	// toCharArray() 메소드로 char[] 배열 만든 뒤 하나씩 값을 비교 
	public int solution(String dartResult) {
		int[] score = new int[3];
		char[] c = dartResult.toCharArray();
		int index = 0;
		
		for(int i = 0; i < c.length; i++) {
			
			if(c[i] >= '0' && c[i] <= '9') {
				if(i <= c.length - 1 && c[i + 1] == '0') {
					score[index] = 10;
					index++;
					i++;
				}
				else {
					score[index] = Character.getNumericValue(c[i]);
					index++;
				}
			}
			else if(c[i] == 'S' || c[i] == 'D' || c[i] == 'T') {
				if(c[i] == 'D') {
					score[index - 1] = (int)Math.pow(score[index - 1], 2);
				}
				else if(c[i] == 'T') {
					score[index - 1] = (int)Math.pow(score[index - 1], 3);
				}
			}
			else {
				if(c[i] == '*') {
					score[index - 1] *= 2;
					
					if(index >= 2) {
						score[index - 2] *= 2;
					}
				}
				else if(c[i] == '#') {
					score[index - 1] *= -1;
				}
			}
		}
		
		return score[0] + score[1] + score[2];
	}
}
