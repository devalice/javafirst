package com.gmail.project_211028;

public class Practice {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//구구단을 2단 부터 9단 까지 출력
		//2*1=2 3*1=3... 9*1=9
		//2*9=18 3*9=27... 9*9=81
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+" ");
			}
			System.out.println();
		}
		
		//*
		//**
		//***
		//****
		//*****
		/**
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		**/
		
		//*****
		//****
		//***
		//**
		//*
		/**
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		**/
		
		//*
		//***
		//*****
		//*******
		//*********
		/****
		for(int i=0; i<5; i++) {
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		****/
		
		//*********
		//*******
		//*****
		//***
		//*
		/****
		for(int i=0; i<5; i++) {
			for(int j=0; j<10-(i*2+1); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		****/
		
		for(int i=0; i<5; i++) {
			//패턴의 변화가 발생하는 지점을 찾아서 나누어서 작성
			if(i<3) {
				for(int j=0; j<i+1; j++) {
					System.out.print("*");
				}
			}else{
				for(int j=0; j<5-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		for(int i=0; i<5; i++) {
			if(i<3) {
				//공백출력
				for(int j=0; j<2-i; j++) {
					System.out.print(" ");
				}
				//*출력
				for(int j=0; j<i+1; j++) {
					System.out.print("*");
				}
			}else{
				for(int j=5-i; j<3; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<5-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

}
