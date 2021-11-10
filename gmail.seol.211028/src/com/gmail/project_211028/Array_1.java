package com.gmail.project_211028;

public class Array_1 {

	public static void main(String[] args) {
		int score1 = 90;
		int score2 = 99;
		int score3 = 87;

		//3개를 출력
		//System.out.println(score1);
		///System.out.println(score2);
		//System.out.println(score3);
        
		//묶어서 하나의 이름으로 저장 - 배열
		int [] scores = {90, 99, 87};
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		for(int score : scores) {
			System.out.println(score);	
		}
	}

}
