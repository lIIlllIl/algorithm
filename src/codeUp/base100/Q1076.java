package codeUp.base100;

import java.util.Scanner;

public class Q1076 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        char c = s.charAt(0);
        
        char d = 'a';
        for(int i = (int)'a'; i <= (int)c; i++) {
            System.out.print(d + " ");
            
            d = (char)((int)d + 1);
        }
    }
}
