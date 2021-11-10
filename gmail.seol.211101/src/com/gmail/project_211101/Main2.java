package com.gmail.project_211101;

public class Main2 {

	public static void main(String[] args) {
		Menu.resName = "삼학분식";
		
		//각각의 메뉴 생성
		Menu menu1 = new Menu();
		menu1.foodName = "라면";
		menu1.price = 3000;
		
		Menu menu2 = new Menu();
		menu2.foodName = "김밥";
		menu2.price = 2000;
		
		//출력
		//분식점 이름
		System.out.println(Menu.resName);
		System.out.println(menu1.foodName + ":" + menu1.price +"원");
		System.out.println(menu2.foodName + ":" + menu2.price +"원");
	}

}
