package com.gmail.project_211028;

public class Flag {

	public static void main(String[] args) {
		/**********
		boolean flag = true;
		for(int i=0; i<10; i=i+1) {
			if(flag == true) {
				System.out.println("깃발 들어");
			}else {
				System.out.println("깃발 내려");
			}
			flag = !flag;
		}
		************/
		
		int j;
		for(j=0; j<5; j++) {
			if(j % 4 == 1) {
				break;
			}
		}
		
		System.out.println(j);
		
		if(j == 5) {
			System.out.println("반복문을 끝까지 수행");	
		}else {
			System.out.println("반복문이 중간에 종료되었습니다");
		}
		
		
		boolean flag = true;
		for(j=0; j<5; j++) {
			if(j % 4 == 10) {
				flag = false;
				break;
			}
		}
		System.out.println(flag);
		
		
	}

}
