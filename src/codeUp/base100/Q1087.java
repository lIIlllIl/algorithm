package codeUp.base100;

import java.util.Scanner;

public class Q1087 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        int result = 0;
        int i = 1;
        
        while(true) {
            result += i; 
            
            if(result >= a) {
                break;
            }
            
            i++;
        }
        
        System.out.println(result);
    }
}
