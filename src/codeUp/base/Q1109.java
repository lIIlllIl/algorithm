package codeUp.base;

import java.util.Scanner;

public class Q1109 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        int age = sc.nextInt();
        String department = sc.next();
        float security = sc.nextFloat();
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(department);
        System.out.println(security);
    }
}
