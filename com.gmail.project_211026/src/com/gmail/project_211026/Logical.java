package com.gmail.project_211026;

public class Logical {
	public static void main(String[] args) {
		int year = 2020;
		//(year가 4의 배수이고 100의 배수가 아니면) 또는 year가 400의 배수인 경우 윤년
		boolean pan = year%4==0 && year%100!=0||year%400==0;
		if(pan == true) {
			System.out.println("year는 윤년");
		}else{
			System.out.println("year는 윤년 아님");
		}
		
		//1부터 100까지 3의 배수이고 4의 배수인 데이터 개수 확인
		//아래 코드가 더 효율적, 앞에는 100+33번 전체 비교, 뒤에는 100+25번 비교
		int cnt=0;
		for(int i=0; i<100; i++) {
			if(i%3==0 && i%4==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		cnt=0;
		for(int i=0; i<100; i++) {
			if(i%4==0 && i%3==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
	}

}
