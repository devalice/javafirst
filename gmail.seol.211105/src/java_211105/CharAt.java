package java_211105;

public class CharAt {

	public static void main(String[] args) {
		String str = "Hello String";

		int len = str.length();
		System.out.println("str의 길이: "+ len);

		//str의 첫 글자가 대문자인지 판별
		char ch = str.charAt(0);
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("첫 글자는 대문자");
		}else {
			System.out.println("첫 글자는 대문자가 아니다");
		}

		//첫 글자가 영문자인지 판별
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
			System.out.println("첫 글자는 영문자");
		}else {
			System.out.println("첫 글자는 영문자가 아니다");
		}
	}

}
