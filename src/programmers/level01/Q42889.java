package programmers.level01;

import java.util.Arrays;
import java.util.Comparator;

public class Q42889 {
	// https://programmers.co.kr/learn/courses/30/lessons/42889
	
	public int[] solution(int N, int[] stages) {
        Failure[] failure = new Failure[N];
        // 해당 게임 어플리케이션의 스테이지(= N) 만큼 이너클래스 Failure 배열 생성 

        for(int i = 0; i < failure.length; i++) {
            failure[i] = new Failure(i + 1);
            // Failure 배열을 각 스테이지 (1 ~ N)으로 초기화 
        }
        
        for(int i = 0; i < stages.length; i++) {
        // stages 배열만큼 반복 

            if( stages[i] != (N + 1) ) {
            // 주어진 스테이지를 모두 클리어한 인원(= N + 1)의 경우를 제외 

                failure[stages[i] - 1].clearUsers++;
                // stages[i] = 해당 인원이 도달했지만 실패한 스테이지
                // stages[i] - 1 = 해당 인원이 클리어한 스테이지 
            }
        }
        
        int totalUsers = stages.length; 
        // 주어진 stages 배열의 길이는 해당 게임 어플리케이션을 실행한 총 인원 
        // failure 배열의 clearUsers를 구할 때 모든 스테이지를 클리어한 인원(N + 1)의 경우
        // 이를 고려하지 않았기 때문에 실패율을 구할 경우 
        // 모든 스테이지를 클리어한 인원이 항상 실패율을 계산할 때 포함되게 하기 위해 
        // 총 인원(= 1스테이지에 도달한 인원수)을 구한 상태에서 다음 블록의 for문 진행 

        for(int i = 0; i < failure.length; i++) {
        	// 게임의 모든 스테이지의 갯수만큼 for문으로 반복문 실행 

            if(failure[i].clearUsers == 0 || totalUsers == 0) {
            // clearUser = 해당 스테이지를 클리어한 인원 수  
            // clearUser == 0일시 0 / totalUsers가 되기 때문에 문제 해결에 오류가 발생함
            	
            // totalUsers = 해당 스테이지에 도달한 인원 수 
            // totalUsers == 0일 경우 claerUsers / 0이 되기 때문에 Infinity가 출력되어 문제 해결에 오류가 발생함 

                failure[i].failureRate = 0.0; 
                // 이 두가지의 경우 실패율을 무조건 0.0으로 고정 
            }
            else {
            // 그 외의 경우 

                failure[i].failureRate = (double) failure[i].clearUsers / totalUsers;
                // 실패율 = 해당 스테이지를 클리어한 인원 수 / 해당 스테이지에 도달한 인원 수 
	  
                
				totalUsers -= failure[i].clearUsers;
				// 다음 스테이지의 실패율을 구할 때 사용하는 
				// 다음 스테이지에 도달한 인원 수 = 
				// 해당 스테이지에 도달한 총 인원 수  - 해당 스테이지를 클리어한 총 인원 수 
              
				// 첫 번째 스테이지의 경우 
				// 게임에 참여한 총 인원이 무조건 첫 번째 스테이지에는 도달했고 
				// 두 번째 스테이지는 
				// 전체 인원수(= 첫 번째 스테이지에 도달한 인원 수) - 첫 번째 스테이지를 클리어한 사람의 인원 수로 계산 가능 
            }
        }
        
        Arrays.sort(failure, new Comparator<Failure>() {
		// Comparator 사용 

            public int compare(Failure f1, Failure f2) {
            // 매개변수로 주어진 f1, f2의 위치를 변경 

            	if(f1.failureRate == f2.failureRate) {	
            	// 실패율이 같을 경우 스테이지를 기준으로 오름차순 

            		return f1.stage - f2.stage; 
            		// return 양수 = 두 매개변수의 위치를 바꾸지 않음 
            		// return 0 = 해당 문제에서는 겹치는 스테이지가 없으므로 고려 대상이 아님  
            		// return 음수 = 두 매개변수의 위치를 바꿈 
                }
                            
                return Double.compare(f2.failureRate, f1.failureRate);
                // 기본 오름차순 정렬을 진행하는 compare() 메소드 사용 
                // compare() 메소드는 주어진 매개변수의 위치에 따라 정렬을 진행하므로
                // 실패율 기준의 경우 내림차순으로 정렬하기 위해 
                // f1, f2 -> f2, f1로 매개변수 위치 변경 
             	}    
        });
        
        int[] answer = new int[failure.length];
        
        for(int i = 0; i < failure.length; i++) {
            answer[i] = failure[i].stage;
            System.out.print(failure[i].stage + " ");
        }
        
        return answer;
    }
    
    class Failure {
        int stage; 
        // 해당 스테이지 
       
        int clearUsers;
        // 해당 스테이지를 클리어한 유저 수 

        double failureRate; 
        // 실패율 

        public Failure(int stage) {
            this.stage = stage;
            // 이너클래스의 인스턴스 생성 시 해당 스테이지로 초기화하도록 함 
        }
    }

}
