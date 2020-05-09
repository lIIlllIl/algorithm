package codeUp.base;

import java.util.Scanner;

public class Q1127 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        double result = 0d;
        
        for(int i = 0; i < 3; i++) {
            float a = sc.nextFloat();
            int b = sc.nextInt();
            
            result += a * b;
        }
        
        System.out.println(String.format("%.1f", result));
    }
}
