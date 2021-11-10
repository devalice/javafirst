package com.gmail.project_211029;

public class Lotto {

	public static void main(String[] args) {
		// 1~45 까지 6개의 숫자를 중복없이 저장하고 작은 것부터 큰 것 순으로 출력
		// 6개의 숫자는 키보드로부터 입력받기.
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("1~45 사이의 6개 숫자를 입력하시오");

		int [] lotto = new int[6];
		int len = lotto.length;

		for(int i=0; i<len; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하시오: ");
			int data = sc.nextInt();

			//숫자 체크
			if(data > 45 || data < 1) {
				System.out.println("1~45 사이의 숫자가 아닙니다. 다시 입력하세요.");
				i = i-1;
				continue;
			}

			//중복 체크
			boolean flag = true;
			for(int imsi : lotto) {
				if(data == imsi) {
					System.out.println("중복된 숫자가 존재합니다.");
					flag = false;
					break;
				}
			}
			if(flag == false) {
				i = i-1;
				continue;
			}

			lotto[i] = data;
		}

		//오름차순 정렬
		int temp = 0;
		for(int i=0; i<len-1; i++) {
			for(int j=i+1; j<len; j++) {
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}


		for(int lotto_temp : lotto) {
			System.out.print(lotto_temp+" ");  
		}

		sc.close();

	}

}
