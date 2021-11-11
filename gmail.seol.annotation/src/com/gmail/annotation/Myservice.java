package com.gmail.annotation;

public class Myservice {
	@Myannotation
	public void method1() {
		System.out.println("실행내용1");
	}
	@Myannotation("*")
	public void method2() {
		System.out.println("실행내용1");
	}
	@Myannotation(value = "*", number = 20)
	public void method3() {
		System.out.println("실행내용1");
	}

}
