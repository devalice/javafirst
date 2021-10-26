package com.gmail.project_211026;

public class DataType1 {

	public static void main(String[] args) {
		//정수를 저장하는 변수를 만들고 데이터를 대입
		int age = 51;
		System.out.println(age);
		
		
		//문자열을 저장하는 변수를 만들고 데이터를 대입
		String name = "아담";
		System.out.println(name);
		
		//문자 - 실제로는 정수로 저장
		char ch= 'A';
		System.out.println(ch);
		//숫자 0은 48, A는 65, a는 97
		ch = 65;
		System.out.println(ch);
		
		System.out.println('a' - 'A'); //32
		
		//제어문자 = 모든 프로그래밍 언어에서 공통
		System.out.println("Hello\nJAVA");
		System.out.println("Hello\tJAVA");
		System.out.println("Hello\\JAVA");
		System.out.println('\\');
	}

}
