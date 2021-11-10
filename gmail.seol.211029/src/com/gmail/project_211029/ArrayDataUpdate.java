package com.gmail.project_211029;

public class ArrayDataUpdate {

	public static void main(String[] args) {
		//3개의 문자열을 입력받아서 배열에 저장
		
		int len = 0;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("데이터 저장 갯수:");
		len = sc.nextInt();
		
		String [] myApps = new String[len]; //현재는 공간만 생성 - 데이터는 모두 null
		
		sc.nextLine();
		
		for(int i=0; i<len; i++) {
			System.out.print("앱 이름 입력:");
			myApps[i] = sc.nextLine();
		}
		
		for(int i=0; i<len; i++) {
			System.out.print(myApps[i]+" ");
		}
		
		for(String app : myApps) {
			System.out.print(app+" ");	
		}

	}

}
