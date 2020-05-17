package programmers.level01;

import java.util.ArrayList;

public class Q42840 {
	// https://programmers.co.kr/learn/courses/30/lessons/42840
	public int[] solution(int[] answers) {   
		// 첫 번째 방법
		// 단순 if문으로 조건을 걸어 조건이 맞을 경우 배열을 새로 생성해 이를 반환 
		/*
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
        
		// 두 번째 방법
		// max라는 int형 변수에 최대 정답수를 저장하여 arrayList에 최대 득점자를 저장 후 배열로 변환 
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
