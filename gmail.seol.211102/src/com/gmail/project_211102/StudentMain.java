package com.gmail.project_211102;

public class StudentMain {

	public static void main(String[] args) {

		Student student1 = new Student();
		System.out.println(student1.getName().toUpperCase());
		System.out.println(student1.getScores()[0]);
		
		Student student2 = new Student(2, "rusia", new int[3]);
		System.out.println(student2.getName().toUpperCase());
		System.out.println(student2.getScores()[0]);
		

	}

}
