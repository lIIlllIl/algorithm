package codeUp.base;

import java.util.Scanner;

public class Q1125 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        System.out.println(Integer.toOctalString(a) + " " + Integer.toHexString(a).toUpperCase());
    }
}
