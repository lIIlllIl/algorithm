package codeUp.base100;

import java.util.Scanner;

public class Q1086 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double result = (double)a * b * c / 8 / Math.pow(1024, 2);
        
        System.out.println(String.format("%.2f", result) + " MB");
    }
}
