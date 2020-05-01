package programmers.level01;

import java.util.Scanner;

public class Q12969 {
	public static void main(String[] args) {
		// https://programmers.co.kr/learn/courses/30/lessons/12969
		
		// 첫 번째 방법
		// 단순 출력 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        for(int i = 0; i < b; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 두 번째 방법
        // StringBuffer로 출력할 별을 문자열로 표현 
        /*
        StringBuffer ab = new StringBuffer();
        for(int i = 0; i < a; i++) {
            ab.append("*");
        }
        
        for(int i = 0; i < b; i++) {
            System.out.println(ab);
        }
        */
    }
}
