package programmers.level02;

public class Q49993 {
	// https://programmers.co.kr/learn/courses/30/lessons/49993
	public int solution(String skill, String[] skill_trees) {
	    int answer = 0;
	    
	    for(int i = 0; i < skill_trees.length; i++) {
	        boolean flag = true;
	
	        // for문이 동작할 때마다 index 0으로 초기화
	        int index = 0;
	
	        // 스킬트리를 한 글자씩 분리 
	        String[] skillArray = skill_trees[i].split("");
	        
	        // 스킬트리의 길이만큼 반복 
	        for(int j = 0; j < skillArray.length; j++) {
	        	// 스킬트리에 선행 스킬 순서에 포함된 글자가 한 글자라도 있을 경우에만 동작
	
	        	// 선행 스킬 순서(index)와 주어진 스킬트리의 순서가 동일한 경우
	            if(index == skill.indexOf( skillArray[j]) ) {
	            	// 다음 선행 스킬 순서로 넘어감
	                index++;
	            }
	
	
	            // 선행 스킬 순서(index)와 주어진 스킬트리의 순서가 동일하지 않은 경우
	            else if(index < skill.indexOf(skillArray[j])) {
	                flag = false;
	                // 올바르지 못한 스킬트리이므로 break 
	                break;
	            }
	            // 예시 
	            // String skill = “ABC” , skill_tree[0] = “ADBC”
	        	
	        	// skill_trees[0] = “ADBC”일 때 skillArray = {“A”, “D”, “B”, “C”}
	        	
	        	// skillArray[0] = A 비교 시 
	        	// skill.indexOf(A) = 0 
	        	// 인덱스는 외부 for문 동작할 때마다 0으로 초기화되므로 index = 0
	        	// index == skill.indexOf(A) 이므로 true, index++ => index = 1 
	        	
	        	// skillArray[1] = D 비교 시 
	        	// skill.indexOf(D) = -1, index = 1 
	        	// index > skill.indexOf(D)이므로 모든 조건문을 만족하지 않으므로 다음 for문 진행
	        	
	        	// skillArray[2] = B 비교 시 
	        	// skill.indexOf(B) = 1, index = 1 
	        	// index == skill.indexOf(B)이므로 true, index++ => index = 2 
	        	
	        	// skillArray[3] = C 비교 시
	        	// skill.indexOf(C) = 2, index = 2
	        	// index == skill.indexOf(C)이므로 true, index++ => index = 3
	        	
	        	// 내부 for문 종료, flag는 그대로 true이므로 answer++ 
	        }
	        
	        if(flag) {
	            answer++;
	        }
	    }
	    
	    return answer;
	}
}
