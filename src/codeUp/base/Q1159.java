package codeUp.base;

import java.util.Scanner;

public class Q1159 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        if( (50 <= a && a <= 70) || (a % 6 == 0) ) {
            System.out.println("win");
        }
        else {
            System.out.println("lose");
        }
    }
}
