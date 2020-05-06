package codeUp.base100;

import java.util.Scanner;

public class Q1098 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        
        int[][] a = new int[h][w];
        
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            x--;
            y--;
            if(d == 0) {
                for(int j = 0; j < l; j++) {
                    a[x][y] = 1;
                    y++;
                }
            }
            else {
                for(int j = 0; j < l; j++) {
                    a[x][y] = 1;
                    x++; 
                }
            }
        }
        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
