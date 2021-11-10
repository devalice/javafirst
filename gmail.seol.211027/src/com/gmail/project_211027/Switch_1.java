package com.gmail.project_211027;

public class Switch_1 {

	public static void main(String[] args) {
		int menu = 0;
		
		//FINAL 읽기 전용 변수
		final int KOREA = 0;
		final int CHINA = 1;
		final int SNACK = 2;
		final int JAPAN = 3;
		
		//menu가 0이면 한식, 1이면 중식, 2이면 분식, 3이면 일식, 나머지는 아무거나
		switch(menu) {
		//문자열 비교라 상수 직접 비교보단 느리지만, 가독성을 위해 권장
		case KOREA:
			System.out.println("한식");
			break;
		case CHINA:
			System.out.println("중식");
			break;
		case SNACK:
			System.out.println("분식");
			break;
		case JAPAN:
			System.out.println("일식");
			break;
		default:
			System.out.println("아무거나");
			break;
		}
	}

}
