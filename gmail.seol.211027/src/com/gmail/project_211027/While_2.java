package com.gmail.project_211027;

public class While_2 {

	public static void main(String[] args) {
		//image1, image2, image3를 순서대로 출력.
		//System.out.println("image1");
		//System.out.println("image2");
		//System.out.println("image3");
	
		int i=0;
		/*
		while(i<3) {
			System.out.println("image"+(i+1));
			//i++; 자바만 가능.
			i = i + 1; //파이썬에선 이 문법만 허용
		}
		*/
		
		//image1, image3, image5, image7
		/*
		i=0;
		while(i<4) {
			//i*2 + 1
			System.out.println("image"+(i+(i+1)));
			i = i + 1;
		}
		*/
		
		//image4, image3, image2, image1
		i=0;
		while(i<4) {
			System.out.println("image"+(4-i));
			i = i + 1;
		}
	}
}
