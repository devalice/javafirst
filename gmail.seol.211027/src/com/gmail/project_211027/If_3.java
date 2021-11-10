package com.gmail.project_211027;

public class If_3 {

	public static void main(String[] args) {
		int score = 70;
		//점수 0 ~ 100
		//90~100: 수
		//80~89: 우
		//70~79: 미
		//60~69: 양
		//0~59: 가
		//+예외처리
		if(score >= 0 && score <= 100) {
			if(score >= 90) {
				System.out.println("수");
			}else if(score > 79) {
				System.out.println("우");
			}else if(score > 69) {
				System.out.println("미");
			}else if(score > 59) {
				System.out.println("양");
			}else {
				System.out.println("가");
			}
		}else {
			System.out.println("오데이터 입력");
		}
		
		if(score >= 90 && score <= 100) {
			System.out.println("수");
		}else if(score < 90 && score > 79) {
			System.out.println("우");
		}else if(score < 80 && score > 69) {
			System.out.println("미");
		}else if(score < 70 && score > 59) {
			System.out.println("양");
		}else if(score < 60 && score >= 0){
			System.out.println("가");
		}else {
			System.out.println("오데이터 입력");
		}
	}
}
