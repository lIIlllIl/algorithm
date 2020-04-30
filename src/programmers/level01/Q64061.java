package programmers.level01;

import java.util.ArrayList;
import java.util.Stack;

public class Q64061 {
	// https://programmers.co.kr/learn/courses/30/lessons/64061
	// 첫 번째 방법
	// arraylist 사용 
	/*
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        ArrayList<Integer> n = new ArrayList<Integer>();

        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][ moves[i] - 1] != 0) {
                    n.add(board[j][ moves[i] - 1]);
                    board[j][ moves[i] - 1] = 0;
                    break;
                }
            }

            if( n.size() > 1) {
                if(n.get(n.size() - 1) == n.get(n.size() - 2)) {
                    n.remove(n.size() - 1); 
                    answer += 2;
                    n.remove(n.size() - 1);
                }
            }
        }
        
        return answer;
        
    }
    */
	
	// 두 번째 방법
	// stack 사용 
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<Integer>(); 

        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[j][ moves[i] - 1] != 0) {
                    
                    if(stack.isEmpty()) {
                        stack.push(board[j][ moves[i] - 1]);
                        board[j][ moves[i] - 1] = 0;
                        break;
                    }
                    
                    if(board[j][moves[i] - 1] == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    }
                    else {
                        stack.push(board[j][moves[i] - 1]);
                    }
                    
                    board[j][moves[i] - 1] = 0;     
                    break;
                }
                
            }

            
        }
        
        return answer;
        
    }
}
