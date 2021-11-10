package com.gmail.project_211102;

public class ThisClass {
	private int num;
	
	public void method() {
		int num = 100;
		
		System.out.println(num); //100
		System.out.println(this.num);
	}
	
	static {
		System.out.println("맨 처음 한 번만 불러지는 코드");
	}
	
	{
		System.out.println("new를 호출할 때 마다 불러지는 코드");
	}

}
