package com.gmail.project_211026;

public class Test {

	public static void main(String[] args) {
		double d= 10.7;
		//d의 값을 소수 첫째 자리에서 반올림해서 저장
		//강제 형변환과 사칙 연산을 이용.
		int result = (int)(d+0.5);
		System.out.println(result);
		
		//소수점 둘째자리 반올림
		d= 10.78;
		double result1 = ((int)(d*10 + 0.5) / 10.0);
		//1. 반올림하고자 하는 자리를 소수 첫째자리로 만들기 
		//d*10 = 107.8 + 0.5 = 108.3 => int형 108
		//다시 10으로 나누기.
		System.out.println(result1);
		
		//10의 자리에서 반올림해서 출력하기
		int money = 87650;
		double money2 = (money*0.01+0.5)*100;
		System.out.println((int)money2);
	}

}
