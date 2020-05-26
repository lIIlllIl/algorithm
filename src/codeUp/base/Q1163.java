package codeUp.base;

import java.util.Scanner;

public class Q1163 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String s = Integer.toString(a + b + c);
        
        if( (s.charAt(s.length() - 2) - '0') % 2 == 0 ) {
            System.out.println("대박");
        }
        else {
            System.out.println("그럭저럭");
        }
    }
}
