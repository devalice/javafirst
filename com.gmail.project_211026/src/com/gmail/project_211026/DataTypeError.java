package com.gmail.project_211026;

public class DataTypeError {

	public static void main(String[] args) {
		//변수를 생성하고 데이터를 저장한 후 출력
		char ch = 'F';
		System.out.println("ch는" + ch+ "입니다");
		
		//에러1
		//int ch = 'a';
		//다른 변수를 생성해서 해결
		char character = 'a';
		//데이터의 종류가 같다면 재사용
		ch= 'a';
		System.out.println(ch);
		
		//에러2
		//ch = 10.4;
		//실수 변수를 만들어서 대입 - 데이터 손실 x
		double d = 10.4;
		//char로 변경해서 대입 - 데이터 손실 o, 소수 사라짐
		ch = (char)98.1;
		System.out.println(ch);
		
		//13은 enter
		char temp = 13;
		System.out.println(temp);
	}

}
