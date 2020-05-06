package codeUp.base100;

import java.util.Scanner;

public class Q1094 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++) {
            int b = sc.nextInt();
            a[i] = b;
        }
        
        for(int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " "); 
        }

    }
}
