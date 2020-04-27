package programmers.level01;

import java.util.*;

public class MokTest {
	// https://programmers.co.kr/learn/courses/30/lessons/42840

    public int[] solution(int[] answers) {      
        int[] personA = {1, 2, 3, 4, 5};
        int[] personB = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] personC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] count = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == personA[i % 5]) {
                count[0]++;
            }
            
            if(answers[i] == personB[i % 8]) {
                count[1]++;
            }
            
            if(answers[i] == personC[i % 10]) {
                count[2]++;
            }
        }
        
        // 첫번째 방식 
        // 바로 배열에서 수포자 1, 2, 3 비교 
        /* 
        if(count[0] > count[1]) {
            if(count[0] > count[2]) {
                return new int[]{1};
            }
            else if(count[0] < count[2]) {
                return new int[]{3};
            }
            
            return new int[]{1, 3};
        }
        else if(count[0] < count[1]) {
            if(count[1] > count[2]) {
                return new int[]{2};
            }
            else if(count[1] < count[2]) {
                return new int[]{3};
            }
            
            return new int[]{2, 3};
            
        }
        else {
            if(count[0] > count[2]) {
                return new int[]{1, 2};
            }
            else if(count[0] < count[2]) {
                return new int[]{3};
            }
            
            return new int[]{1, 2, 3};
        }
        */
        
        // 두 번째 방식 
        // 최대 정답률 max 사용 
        /*
        int max = count[0];
        
        if(max < count[1]) {
            max = count[1];
        }
        
        if(max < count[2]) {
            max = count[2];
        }
       
        if(max == count[0] && max == count[1] && max == count[2]) {
            return new int[]{1, 2, 3};
        }
        else if(max == count[0] && max == count[1]) {
            return new int[]{1, 2};
        }
        else if(max == count[0] && max == count[2]) {
            return new int[]{1, 3};
        }
        else if(max == count[1] && max == count[2]) {
            return new int[]{2, 3};
        }
        else if(max == count[0]) {
            return new int[]{1};
        }
        else if(max == count[1]) {
            return new int[]{2};
        }
        else {
            return new int[]{3};
        }
        */
        
        // 세 번째 방식
        // arraylist 이용 
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        
        int max = 0;
        for(int i = 0; i < 3; i++) {
            if(max < count[i]) {
                resultList = new ArrayList<Integer>();
                resultList.add(i + 1);
                max = count[i];
            }
            else if(max == count[i]) {
                resultList.add(i + 1);
            }
        }
        
        int[] answer = new int[resultList.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}

