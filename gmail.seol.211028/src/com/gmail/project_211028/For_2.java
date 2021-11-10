package com.gmail.project_211028;

public class For_2 {
	
	public static void main(String[] args) {
		
		//for에서 2개의 실행문을 ()안에서 작성할 때는 ,로 구분
		for(int i=0, j=0; i<3; i=i+1, j=j+1) {
			System.out.println("For");
		}
		
		int k,l;
		for(k=0, l=0; k<3; k=k+1, l=l+1) {
			System.out.println("For");
		}
	}

}
