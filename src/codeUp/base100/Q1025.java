package codeUp.base100;

import java.util.Scanner;

public class Q1025 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        for(int i = 0; i < s.length(); i++) {
            int a = (int)Math.pow(10, (s.length() - i - 1));
            int b = (s.charAt(i) - '0') * a;
            System.out.println("[" + b + "]");
        }
    }
}
