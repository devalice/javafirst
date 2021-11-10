package com.gmail.project_211027;

public class Practice {

	public static void main(String[] args) {
		//113507 초가 몇 시간 몇 분 몇 초인지 계산
		int time = 113507;
		//int min = time / 60;
		int hour = time / 3600;
		
		//System.out.println( hour + "시간 " + (min - (hour*60)) + 
			//	"분 " + (time - (hour*60*60) - (min - (hour*60))*60) + "초 ");
        
		int min = (time%3600) / 60;
		int sec = time%60;
		System.out.println( hour + "시간 " + min + 
				"분 " + sec + "초 ");
		
		//x와 y의 데이터 교환
		int x = 30;
		int y = 70;
		int swap = x;
		x = y;
		y = swap;
		System.out.println("x: "+ x);
		System.out.println("y: "+ y);

	}

}