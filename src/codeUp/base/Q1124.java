package codeUp.base;

import java.util.Scanner;

public class Q1124 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    
        int a = Integer.parseInt(s.substring(s.indexOf("C") + 1, s.indexOf("H")));
        int b = Integer.parseInt(s.substring(s.indexOf("H") + 1));
        
        System.out.println(a * 12 + b);
    }
}
