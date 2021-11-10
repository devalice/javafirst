package com.gmail.project_211028;

public class Etc {

	public static void main(String[] args) {
		//1부터 10까지 출력하는 반복문
		//1,2,3,4,5,6,7,8,9,10
		for(int i=0; i < 10; i=i+1) {
			System.out.print(i+1);
			if((i+1)!=10) {
				System.out.print(",");
			}
		}
		
		System.out.println("");
		for(int i=0; i<10; i=i+1) {
			if((i+1)%3 == 0) {
				//break; //3의 배수면 종료
				continue; //다음 인덱스로 넘어감
			}
			System.out.print(i+1);
			if((i+1)!=10) {
				System.out.print(",");
			}
		}
	}

}
