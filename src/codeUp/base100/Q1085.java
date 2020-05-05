package codeUp.base100;

import java.util.Scanner;

public class Q1085 {	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        
        double result = (double)h * b * c * s / 8 / Math.pow(1024, 2);
        
        System.out.println(String.format("%.1f", result) + " MB");
    }
}
