package com.gmail.project_211026;

public class DataTypeCasting {

	public static void main(String[] args) {
		//정수 변수에 실수 데이터 사입 - 에러
		//int age = 51.7;
		
		//실수 변수에 정수 데이터를 대입 - 자동 형 변환이 발생해서 에러 발생 안함.
		double height = 168;
        System.out.println("키는" + height + "cm");
        
        //강제 형 변환
        int age = (int)51.8;
        System.out.println("나이는" + age + "입니다");
        
        //overflow underflow
        //overflow: 가장 큰 쪽으로 넘어가서 가장 작은 것부터 다시 시작
        //byte -128 ~ 127
        byte b = (byte)128;
        System.out.println(b);
        b = (byte)-130;
        System.out.println(b);
	}

}
