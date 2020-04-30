package codeUp.base100;

import java.util.Scanner;

public class Q1027 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] b = s.split("\\.");
        System.out.println(b[2] + "-" + b[1] + "-" + b[0]);
    }
}
