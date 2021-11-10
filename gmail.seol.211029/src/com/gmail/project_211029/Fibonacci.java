package com.gmail.project_211029;

public class Fibonacci {

	public static void main(String[] args) {
		//1 1 2 3 5 8 13 21 34
		//12번째 피보나치 수열의 값을 제어문을 이용해서 찾기.
		int a=1;
		int b=1;
		int c=1;
		for(int i=0; i<12; i++) {
			System.out.println((i+1)+"번째 피보나치 수열: "+ a);			
			c = a+b;
			a = b;
			b = c;
		}
	}

}
