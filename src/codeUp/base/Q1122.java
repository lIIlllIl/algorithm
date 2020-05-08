package codeUp.base;

import java.util.Scanner;

public class Q1122 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(); 
        
        System.out.println( (a / 60) + " " + (a % 60)  );
    }
}
