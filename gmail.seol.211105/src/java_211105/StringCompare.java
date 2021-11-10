package java_211105;

public class StringCompare {

	public static void main(String[] args) {
		
		//1. 생성
		String str = "My name is";
		StringBuilder sb = new StringBuilder("My name is");
		
		//2. 해시코드 출력
		System.out.println("str: "+ str.hashCode());
		System.out.println("sb: "+ sb.hashCode());
		
		//StringBuilder는 현재 공간에서 작업을 수행
		
		String str1= "adam";
		String str2 = "ADAM";
		String str3 = "Adam";
		
		//좌우공백을 제거하고 대소문자 일치시키고 비교
		//비밀번호는 대소문자 구분하기에 예외
		System.out.println(
				str1.trim().toUpperCase().equals(str2.trim().toUpperCase()));
		System.out.println(
				str1.trim().toUpperCase().equals(str3.trim().toUpperCase()));
		
		//대소문자 변환을 하지 않은 상태에서 크기 비교를 하면 소문자가 크다고 나옴
		System.out.println(str1.compareTo(str2));
		//크기 비교한 결고가 앞의 것이 크면 앞의 것이 크다고 같으면 같다고 비교 대상이 크면 뒤의 것이 크다고 출력
		int result = str1.compareTo(str2);
		if(result > 0) {
			System.out.println("str1이 더 크다");
		}else if(result == 0) {
			System.out.println("str1과 str2는 같다");	
		}else {
			System.out.println("str2가 더 크다");
		}
		
		
		
		
	}

}
