package com.gmail.project_211028;

public class RamdomNumber {

	public static void main(String[] args) {
		java.util.Random r =new java.util.Random();
		for(int i=0; i<5; i++) {
			int x =r.nextInt(45);
			System.out.println(x+1);
		}
	}

}
