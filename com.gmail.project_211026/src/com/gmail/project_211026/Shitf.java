package com.gmail.project_211026;

public class Shitf {

	public static void main(String[] args) {
		int data = 127;
		//<<2는 곱하기 4한 것과 동일
		System.out.println(data << 2);
		//>>2는 나누기 4한 것과 동일
		System.out.println(data >> 2);
		//>>34는 32보다 크므로 32의 나머지인 2와 동일.
		System.out.println(data >> 34);
	}

}