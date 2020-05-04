package codeUp.base100;

import java.util.Scanner;

public class Q1075 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        for(int i = a; i > 0; i--) {
            System.out.println(--a); 
        }
    }
}
