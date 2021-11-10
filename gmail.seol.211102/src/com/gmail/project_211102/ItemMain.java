package com.gmail.project_211102;

public class ItemMain {

	public static void main(String[] args) {
		//Item 클래스의 인스턴스 만드는 방법을 확인해보고 각각의 방법으로 인스턴스 생성
		Item item1 = new Item();
		Item item2 = new Item(1, "hp포션", "hp 500증가", 500, "c:\\");
		
		//생성된 인스턴스 값 출력
		System.out.println(item1);
		System.out.println(item2);
	}

}
