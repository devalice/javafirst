package com.gmail.project_211102;

public class Student {
	
	private int num;
	private String name;
	private int[] scores;
	
	//매개변수가 없는 생성자 - 리턴이 없음
	public Student() {
		num = 1;
		name = "noname";
		scores = new int[3];
	}

	public Student(int i, String name, int[] scores) {
		this.num = i;
		this.name = name;
		this.scores = scores;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	//매개변수가 있는 생성자
	//매개변수가 없는 생성자가 있어서 overriding
	

}
