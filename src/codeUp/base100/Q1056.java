package codeUp.base100;

import java.util.Scanner;

public class Q1056 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if((a == 1 && b == 0) || (a == 0 && b == 1) ) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
