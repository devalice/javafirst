package com.gmail.project_211101;

public class Main5 {
	public static void main(String[] args) {
		int n1 = 20;
		int n2 = 30;

		//n1과 n2는 기본형 데이터라서 메서드를 호출해도 결과가 변경되지 않습니다.
		ParameterType.valueSwap(n1, n2);
		System.out.println("n1: "+ n1);
		System.out.println("n2: "+ n2);
		
		//배열 - 기본형이 아님
		int [] xr = {100, 200, 300};
		//기본형이 아닌 데이터를 메서드에 대입하면 원본 데이터가 변경될 수도 있음
		ParameterType.refSwap(xr);
		System.out.println("xr[0]: "+ xr[0]);
		System.out.println("xr[1]: "+ xr[1]);
	}

}



