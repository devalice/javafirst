package com.gmail.project_211102;

public class ThisMain {

	public static void main(String[] args) {
		ThisClass thisClass = new ThisClass();
		thisClass.method();
		
		thisClass = new ThisClass(); //초기화 블럭은 new할 때마다 호출
	}

}
