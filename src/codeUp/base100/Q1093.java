package codeUp.base100;

import java.util.Scanner;

public class Q1093 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[23 + 1];
        
        for(int i = 1; i <= n; i++) {
            int b = sc.nextInt();
            a[b]++;
        }
        
        for(int i = 1; i < a.length; i++) {
            System.out.print(a[i] + " "); 
        }

    }
}
