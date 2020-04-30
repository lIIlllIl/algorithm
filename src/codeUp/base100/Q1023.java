package codeUp.base100;

import java.util.Scanner;

public class Q1023 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] b = s.split("\\.");
        System.out.println(b[0] + "\n" + b[1]);
    }
}
