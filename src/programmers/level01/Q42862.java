package programmers.level01;

public class Q42862 {
	// https://programmers.co.kr/learn/courses/30/lessons/42862
	
	// 배열을 생성해 학생들이 가지고 있는 체육복 수를 만들어 연산
	// 최선의 방법은 체육복을 잃어버린 학생의 앞 번호 학생이 체육복을 빌려주는 경우 
	// 차선의 방법은 체육복을 잃어버린 학생의 뒷 번호 학생이 체육복을 빌려주는 경우 
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] student = new int[n + 1]; 
        
        for(int i = 1; i < student.length; i++) {
            student[i] = 1;
        }
        
        for(int i = 0; i < lost.length; i++) {
            student[lost[i]]--;
        }
        
        for(int i = 0; i < reserve.length; i++) {
            student[reserve[i]]++;
        }
        
        for(int i = 1; i < student.length; i++) {
            if(i - 1 > 0) {
                if(student[i] == 0 && student[i - 1] > 1) {
                    student[i]++;
                    student[i - 1]--;
                }
            }
            
            if(i + 1 < student.length) {
                if(student[i] == 0 && student[i + 1] > 1) {
                    student[i]++;
                    student[i + 1]--;
                }
            }
        }
        
        for(int i = 1; i < student.length; i++) {
            if(student[i] > 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
