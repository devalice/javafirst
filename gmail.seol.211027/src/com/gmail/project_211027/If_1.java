package com.gmail.project_211027;

public class If_1 {

	public static void main(String[] args) {
		int year = 2021;
		//(year가 4의 배수이고 100의 배수가 아니면) 또는 year가 400의 배수인 경우 윤년
		boolean pan = year%4==0 && year%100!=0||year%400==0;
		if(pan == true) {
			System.out.println("year는 윤년");
		}else{
			System.out.println("year는 윤년 아님");
		}
	}

}
