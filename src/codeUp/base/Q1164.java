package codeUp.base;

import java.util.Scanner;

public class Q1164 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a <= 170 || b <= 170 || c <= 170) {
            System.out.println("CRASH");
            return;
        }
        
        System.out.println("PASS");
    }    
}
