package com.gmail.project_211028;

public class ConsoleInput {

	public static void main(String[] args) {
		//키보드로 입력받을 수 있는 인스턴스
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("이름을 입력하세요:");
		String name =sc.nextLine();
		
		System.out.println("점수를 입력하세요:");
		int score =sc.nextInt();
		
		System.out.println("이름: "+name+" 점수: "+score);

		System.out.println("별명을 입력하세요:");
		sc.nextLine(); //버퍼에 남아있는 내용 지우기
		String nick =sc.nextLine(); //위에 추가하지 않으면 숫자에서 받은 엔터가 여기로 들어감
		
		System.out.println("별명: "+nick);		
		
		sc.close();
	}

}
