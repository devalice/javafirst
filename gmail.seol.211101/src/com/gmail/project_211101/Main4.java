package com.gmail.project_211101;

public class Main4 {
	
	public static void changeInteger(Integer param) {
        param += 10;
    }
	
	public static void main(String[] args) {
		MethodClass obj = new MethodClass();
		obj.methodClass();
		
		//static 메소드 호출
		MethodClass.noArgDisp();
		MethodClass.argDisp(5);
		
		MethodClass.towArgDisp("안녕", 5);
		
		obj.noReturnAdd(2, 3);
		
		int result = obj.returnAdd(1, 3);
		System.out.println(result);
		result = obj.returnAdd(result, 300);
		System.out.println(result);
		
	}

}
