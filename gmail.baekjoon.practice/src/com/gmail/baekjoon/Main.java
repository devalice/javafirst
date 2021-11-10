package com.gmail.baekjoon;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		//String str2 = sc1.nextLine();
	
		//int result = str2.charAt(0) -'0' + str2.charAt(2) -'0';
		//System.out.println(result);
		//System.out.println(sc1.nextInt() - sc1.nextInt());
		
		int a= sc1.nextInt();
		int b= sc1.nextInt();
		int c= sc1.nextInt();
		
		if(a>=2 && c<=10000) {
			System.out.println((a+b)%c);
			System.out.println(((a%c)+(b%c))%c);
			System.out.println((a*b)%c);
			System.out.println(a / b);
		    System.out.println(a % b);
		}
	}

}
