package com.gmail.project_211027;

public class If_2 {

	public static void main(String[] args) {
		int score = 54;
		//1. 누가 더 빠를까. 
		//2. 누가 더 읽기 좋은가. (첫번째거)
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		if(score < 60) {
			System.out.println("불합격");
		}else {
			System.out.println("합격");
		}
		
		if(!(score < 60)) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		score = 59;
		//score가 80이상이면 장학금
		//60 ~ 79 라면 보통
		//60미만이라면 저조
		if(score >= 80) {
			System.out.println("합격");
		}else if(60 <= score && 80 > score) {
			System.out.println("보통");
		}else {
			System.out.println("저조");
		}

	}

}
