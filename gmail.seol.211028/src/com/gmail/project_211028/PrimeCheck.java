package com.gmail.project_211028;

public class PrimeCheck {

	public static void main(String[] args) {
		//Prime(소수): 1과 자기 자신으로만 나누어 떨어지는 수
		//소수 판별하는 방법: 2부터 자신의 절반이 되는 숫자까지 나누어서 한번도 나누어 떨어지지 않으면 소수
		int su = 4;
		boolean flag = true;

		if(su == 0 || su == 1) {
			flag = false;
		}

		for(int i=2; i<=su/2; i=i+1) {				
			if(su % i==0) {
				flag = false;
				break;
			}
		}

		if(flag == true) {
			System.out.println("소수 입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
	}

}
