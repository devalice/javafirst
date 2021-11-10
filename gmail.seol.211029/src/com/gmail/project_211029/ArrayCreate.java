package com.gmail.project_211029;

public class ArrayCreate {

	public static void main(String[] args) {
		//1. 처음부터 데이터를 가지고 생성
		//정수(실수) 3개를 배열로 저장
		double [] scores = {90.8,80,89};
		
		//이름 3개를 배열로 저장하기
		String [] names = {"Peter", "Sam", "Alice"};
		
		//인덱스 오류 - java.lang.ArrayIndexOutOfBoundsException
		//System.out.println(names[3]);
		
		//이름이 없어서 발생하는 오류
		//System.out.println(kors.length);
		
		//java.lang.NullPointerException
		int [] kors = null;
		//System.out.println(kors.length);
		
		//전체 데이터 접근 - 이전에 접근했던 위치에서 접근
		System.out.println("빠른 열거를 이용.");
		for(String name : names) {
			System.out.print(name+" ");
		}
		
	}

}
