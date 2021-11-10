package com.gmail.project_211101;

public class Main3 {

	public static void main(String[] args) {
		// 인스턴스 배열 만들기 - 3개 저장하도록 하기
		Menu [] menus = new Menu[3];
		
		//인스턴스 대입하기
		for(int i=0; i<menus.length; i++) {
			menus[i] = new Menu();
		}
		
		menus[0].foodName = "어묵";
		menus[0].price = 500;
		
		menus[1].foodName = "떡볶이";
		menus[1].price = 2500;
		
		menus[2].foodName = "김밥";
		menus[2].price = 2000;
		
		for(Menu menu : menus) {
			System.out.println(menu.foodName+": "+menu.price);
		}
	}

}
