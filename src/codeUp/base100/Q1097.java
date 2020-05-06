package codeUp.base100;

import java.util.Scanner;

public class Q1097 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] a = new int[19][19];
        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        int n = sc.nextInt();
        int x;
        int y;
        for(int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            
            for(int j = 0; j < a.length; j++) {
                if(a[x - 1][j] == 0) {
                    a[x - 1][j] = 1;
                }
                else {
                    a[x - 1][j] = 0;
                }
                
                if(a[j][y - 1] == 0) {
                    a[j][y - 1] = 1;
                }
                else {
                    a[j][y - 1] = 0;
                }
            }
        }
        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
