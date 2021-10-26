package com.gmail.project_211026;

public class Increment_Decrement_Postfix {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 2;
		int num3;
		int num4;
		
		//c언어와 결과 동일
		num3 = num1++; //num1을 num3에 할당 후 num1 증가
		num4 = num2--;
        
		System.out.println(num3);
		System.out.println(num4);
		
		num3 = ++num1; //num1을 num3에 할당 후 num1 증가
		num4 = --num2;
        
		System.out.println(num3);
		System.out.println(num4);
		
		
		//정수/실수
		System.out.println(10/3);
		System.out.println((double)10/3);
		System.out.println(10/(double)3);
		
		//byte int로 자동 형변환
		byte b = 30;
		byte c = 20;
		byte d = (byte)(b+c);
		int e = (b+c);
		System.out.println(d);
		System.out.println(e);
	}

}
