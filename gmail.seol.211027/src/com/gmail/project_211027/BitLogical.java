package com.gmail.project_211027;

public class BitLogical {

	public static void main(String[] args) {
		//20과 17을 저장하는 변수를 생성
		int data1 = 20;
		int data2 = 17;
		System.out.println("data1 & data2 : " + (data1&data2));
		
		
		
		
		//2진법 프로그래밍
				//1. &
				int c = 20;
				int[] ary = {0,0,0,0,0,0,0,0};				
				for(int i=0; i<ary.length; i++) {
					int mod = c%2; //나머지
					c = c/2;
					//System.out.println("mod : " +mod);
					ary[ary.length-(i+1)] = mod;
				}
				for(int i=0; i < ary.length; i++) {
					System.out.print(ary[i]);					
				}
				
				//2. |
				
				//3. ^

	}

}
