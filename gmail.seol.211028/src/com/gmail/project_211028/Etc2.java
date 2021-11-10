package com.gmail.project_211028;

public class Etc2 {

	public static void main(String[] args) {
		
		//제어문 안에 문장이 1개 일때는 {} 생략 가능 => 비추천
		for(int i=0; i<3; i=i+1) {
			System.out.println("Hello World");
		}	
		
		//( )뒤에 ; 붙으면 한 번만 실행됨. for문이 없는 것과 같음.
		for(int i=0; i<3; i=i+1); {
			System.out.println("Hello World");
		}
		
		//dead code
		for(;;) {} //무한 반복이라 아래 코드에 도달할 수 없음.
		//System.out.println("Dead Code");

	}

}
