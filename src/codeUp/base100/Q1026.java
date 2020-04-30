package codeUp.base100;

import java.util.Scanner;

public class Q1026 {	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] b = s.split(":");
        System.out.println(Integer.parseInt(b[1]));
    }
}
