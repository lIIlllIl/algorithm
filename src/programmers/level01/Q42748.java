package programmers.level01;

import java.util.Arrays;

public class Q42748 {
	// https://programmers.co.kr/learn/courses/30/lessons/42748
	public int[] solution(int[] array, int[][] commands) {
		// 첫 번째 방법 
		// 이중 for문 사용 
        /*
        List<Integer> answerList = new ArrayList<Integer>();
        
        for(int i = 0; i < commands.length; i++) {
            List<Integer> tempList = new ArrayList<Integer>();
            
            for(int j = commands[i][0]; j <= commands[i][1]; j++) {
                tempList.add(array[j - 1]);
            }
            Collections.sort(tempList);
            answerList.add(tempList.get(commands[i][2] - 1));
        }
        
        int[] answer = new int[answerList.size()];
        
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
        */
        
		// 두 번째 방법
		// Arrays.copOfRange() 메소드를 통해 주어진 범위의 배열 추출 
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            int[] dummyArray = Arrays.copyOfRange(array, (commands[i][0] - 1), commands[i][1] );
            Arrays.sort(dummyArray);
            answer[i] = dummyArray[ ( commands[i][2] - 1  ) ];
        }
        
        return answer;
    }
}
