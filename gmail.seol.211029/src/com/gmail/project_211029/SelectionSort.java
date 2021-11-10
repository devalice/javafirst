package com.gmail.project_211029;

public class SelectionSort {

	public static void main(String[] args) {
		//1. 정수 5개를 저장하는 배열을 생성 - 초기값을 임의로 부여
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("정수의 갯수를 입력하시오:");
		
		int len = sc.nextInt();
		int [] data = new int[len];

		/*for(int i=0; i < 5; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요:");
			data[i] = sc.nextInt();
		}*/
		
		System.out.print(len+"개의 숫자를 입력하세요:");
		
		for(int i=0; i < len; i++) {
			data[i] = sc.nextInt();
		}
		
		
		int temp = 0;
		
		//오름차순
		for(int i=0; i<len-1; i=i+1) {
			for(int j=i+1; j<len; j=j+1) {
				if(data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		System.out.println("오름차순으로 출력합니다.");
		for(int asc_data : data) {
			System.out.println(asc_data+" ");
		}
		
		//내림차순
		/**
		for(int i=0; i<len-1; i=i+1) {
			for(int j=i+1; j<len; j=j+1) {
				if(data[i] < data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		System.out.println("내림차순으로 출력합니다.");
		for(int asc_data : data) {
			System.out.println(asc_data+" ");
		}
		**/
		sc.close();
	}

}
