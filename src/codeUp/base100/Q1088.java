package codeUp.base100;

import java.util.Scanner;

public class Q1088 {	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        for(int i = 1; i <= a; i++) {
            System.out.print( (i % 3 == 0) ? "" : i + " " );
        }
    }
}
