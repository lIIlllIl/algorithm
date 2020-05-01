package codeUp.base100;

import java.util.Scanner;

public class Q1039 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String[] sa = s.split(" ");
        
        long a = Long.parseLong(sa[0]);
        long b = Long.parseLong(sa[1]);
        
        long c = a + b;
        System.out.println(c);
    }
}
