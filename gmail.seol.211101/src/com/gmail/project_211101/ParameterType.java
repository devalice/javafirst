package com.gmail.project_211101;

public class ParameterType {
	//매개변수의 자료형이 int(기본형)
	//매서드 내에서 매개변수의 값을 변경해도 호출할 때 대입된 데이터를 영향이 없음
	public static void valueSwap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	//매개변수의 자료형이 int [](배열)
	//매서드 내에서 매개변수의 값을 변경하면 호출할 때 대입된 데이터를 영향이 없음
	public static void refSwap(int []ar) {
		int temp = ar[0];
		ar[0] = ar[1];
		ar[1] = temp;
	}

}
