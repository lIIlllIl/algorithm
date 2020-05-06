package codeUp.base100;

import java.util.Scanner;

public class Q1096 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] a = new int[19][19];
        
        int n = sc.nextInt();
        int x;
        int y;
        
        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            
            a[x - 1][y - 1] = 1; 
        }
        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
