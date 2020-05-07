package codeUp.base;

import java.util.Scanner;

public class Q1120 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.printf("%.2f", ((a + b + c) / 3.0));
    }
}
