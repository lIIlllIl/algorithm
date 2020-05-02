package codeUp.base100;

import java.util.Scanner;

public class Q1046 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        long d = a + b + c;
        
        System.out.println(d);
        System.out.println(String.format("%.1f", ((double)d / 3)));
    }
}
