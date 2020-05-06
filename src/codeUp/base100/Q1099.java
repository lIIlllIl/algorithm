package codeUp.base100;

import java.util.Scanner;

public class Q1099 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] maze = new int[10][10];
        
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        int y = 1;
        
        boolean flag = false;
        
        for(int i = 1; i < 10; i++) {
            for(int j = y; j < 10; j++) {
                if(maze[i][j] == 0) {
                    maze[i][j] = 9;
                }
                else if(maze[i][j] == 1) {
                    y = j - 1; 
                    break;
                }
                else {
                    maze[i][j] = 9;
                    flag = true;
                    break;
                }
            }
            
            if(flag) {
                break;
            }
        }
        
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
