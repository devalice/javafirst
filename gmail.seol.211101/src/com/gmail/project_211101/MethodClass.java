package com.gmail.project_211101;

public class MethodClass {
	public void methodClass(){
		System.out.println("Hello Java");

	}

	public static void noArgDisp() {
		//반복문을 3번출력
		for(int i=0; i<3; i++) {
			System.out.println("반복문");
		}
	}

	public static void argDisp(int n) {
		//반복문을 3번출력
		for(int i=0; i<n; i++) {
			System.out.println("매개변수가 있는 함수");
		}
	}

	public static void towArgDisp(String str, int n) {
		for(int i=0; i<n; i++) {
			System.out.println(str);
		}
	}

	//리턴이 없는 2개의 정수를 받아서 더한 후 출력
	public void noReturnAdd(int n1, int n2) {
		System.out.println(n1+n2);
	}

	public int returnAdd(int n1, int n2) {
		return n1 + n2;
	}
}
