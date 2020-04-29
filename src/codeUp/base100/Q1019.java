package codeUp.base100;

import java.util.Scanner;

public class Q1019 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split("\\.");
        
        System.out.printf("%04d.%02d.%02d", Integer.parseInt(b[0]), Integer.parseInt(b[1]), Integer.parseInt(b[2]));
    }
}
