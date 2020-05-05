package codeUp.base100;

import java.util.Scanner;

public class Q1082 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int a = Integer.parseInt(s, 16);
        
        for(int i = 1; i < 16; i++) {
            int result = i * a;
            
            System.out.println(Integer.toHexString(a).toUpperCase() + "*" + Integer.toHexString(i).toUpperCase() + "=" + Integer.toHexString(result).toUpperCase()  );
        }
    }
}
