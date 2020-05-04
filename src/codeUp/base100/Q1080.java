package codeUp.base100;

import java.util.Scanner;

public class Q1080 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        int i = 1;
        int result = 0;
        while(true) {
            result += i;
            
            if(result >= a) {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
