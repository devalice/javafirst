package com.gmail.project_211101;

public class Main1 {

	public static void main(String[] args) {
		//인스턴스 만들기
		Student student1 = new Student();
		System.out.println(student1);
		
		Student student2 = new Student();
		System.out.println(student2);
		
		//기존 인스턴스를 다른 이름으로 사용할 수 있도록 하기
		//new를 호출해야 새로운 인스턴스가 만들어진다
		Student student3 = student2;
		System.out.println(student3);
		
		//static이 붙은 것과 그렇지 않은 멤버의 차이
		//static이 붙지 않으면 인스턴스만 사용 가능, static이 붙으면 class명.static변수 사용 가능
		//static이 붙지 않은 멤버변수는 인스턴스가 별도로 메모리 할당을 받아서 사용
		student1.num = 1;
		student2.num = 2;
		System.out.println(student1.num);
		System.out.println(student2.num);
		
		System.out.println(Student.school);
		System.out.println(student1.school);
		System.out.println(student2.school);
		
	}

}
