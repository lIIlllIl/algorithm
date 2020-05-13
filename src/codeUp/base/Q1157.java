package codeUp.base;

import java.util.Scanner;

public class Q1157 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        
        if(a > 50.0 && a < 60.0 ) {
            System.out.println("win");
        }
        else {
            System.out.println("lose");
        }
    }
}
