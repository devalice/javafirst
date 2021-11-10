package com.gmail.project_211027;

public class DoWhile {

	public static void main(String[] args) {
		//hani1.jpg, hani2.jpg, hani3.jpg
		int j = 1;
		/* do {
			System.out.println("hani"+j+".jpg");
			j = j + 1;
		}while(j < 4); */
		
		//2,1,0 순으로
		/*
		j = 1;
		do {
			System.out.println("hani"+(3-j)+".jpg");
			j = j + 1;
		}while(j < 4);
		*/
		
		//5, 3, 1
		j = 1;
		do {
			System.out.println("hani"+(6-(2*j-1))+".jpg");
			j = j + 1;
		}while(j < 4);
		
		//1, 16, 31 순으로 출력하기
		j = 1;
		do {
			System.out.println("hani"+(15*(j-1)+1)+".jpg");
			j = j + 1;
		}while(j < 4);
	}

}
