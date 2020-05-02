package codeUp.base100;

import java.util.Scanner;

public class Q1041 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char c = (sc.nextLine()).charAt(0);
        c = (char)((int)c + 1);
        
        System.out.println(c);
    }
}
