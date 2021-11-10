package com.gmail.project_211027;

public class If_4 {

	public static void main(String[] args) {
		String id = "adam";
		String pw = "1234";
		
		//id와 pw가 adam과 1234이면 로그인 성공
		//id는 adam이 맞는데 비밀번호가 1234가 아니면 비밀번호가 틀림.
		//id가 adam이 아니면 없는 id
		
		if(id == "adam" && pw == "1234") {
			System.out.println("로그인 성공");
		}else if(id == "adam") {
			System.out.println("pw가 틀립니다");
		}else {
			System.out.println("id가 틀립니다");
		}
		
		if(id != "adam") {
			System.out.println("id가 틀립니다");
		}else if(pw != "1234") {
			System.out.println("pwd가 틀립니다");
		}else {
			System.out.println("로그인 성공");
		}

	}

}
