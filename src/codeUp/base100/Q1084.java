package codeUp.base100;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q1084 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();				
		int b = sc.nextInt();				
		int c = sc.nextInt();				
		
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				StringBuilder str = new StringBuilder();
				
				for(int k=0; k < c; k++) {
				    str.append(i).append(" ").append(j).append(" ").append(k).append("\n");
				}
				
				bf.write(str.toString());
				bf.flush();
			}
		}
		System.out.println(a * b * c);
	}
}
