package codeUp.base100;

import java.util.Scanner;

public class Q1048 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(  (int)(a * Math.pow(2, b))  );
    }
}
