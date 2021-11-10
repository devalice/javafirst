package com.gmail.project_211027;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		//50.7, 50.4를 소수 첫째 자리에서 반올림
		
		double rounds = 0.5;
		int a = (int)(50.7+rounds);
		System.out.println(a);
		
		a = (int)(50.4+rounds);
		System.out.println(a);
		
		//65980 65940 정수 둘째 자리에서 반올림
		int b = ((int)(65980*0.01+rounds)*100);
		System.out.println(b);
		b = ((int)(65940*0.01+rounds)*100);
		System.out.println(b);
		
		
	}

}
