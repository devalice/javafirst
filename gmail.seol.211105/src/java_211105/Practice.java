package java_211105;

public class Practice {
	
	//Hello World를 대문자로 출력하기
	public static String practice1(String str) {
		
		char [] ch = new char[str.length()];
		int temp = 0;
		
		for(int i=0; i<str.length(); i = i+1) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				temp = str.charAt(i);
				ch[i] = (char)(temp - 32);
			}else {
				ch[i] = str.charAt(i);
			}
		}
		return str.toUpperCase();
	}

	//"Hello World"에서 중간 공백을 제거하고 출력
	public static String practice2(String str) {
		int len = str.length();
		char[] copych = new char[len];
		int j = 0;
		
		for(int i=0; i<len; i = i+1) {
			if(str.charAt(i) == ' ') {
				continue;
			}
			copych[j++] = str.charAt(i);
		}
		
		//줄어든 공간 만큼의 배열 다시 생성
		char[] copych2 = new char[j];
		for(int i=0; i<copych2.length; i++) {
			copych2[i] = copych[i];
		}

		String temp = "";
		for(char ch : copych2)
			temp = temp + ch;
		
		return temp;
	}

	//anagram
	public static String practice3(String str1, String str2) {
		
		//비교 문자 대문자로 변경
		str1 = practice1(str1);
		str2 = practice1(str2);
		
		//비교 문자 공백 제거
		str1 = practice2(str1);
		str2 = practice2(str2);
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1 != len2) {
			return str1 + "과 " + str2 + "는 애나그램이 아닙니다";
		}
		
		//char 배열로 복사
		int[] copystr1 = new int[len1];
		int j1 = 0;
		for(int i=0; i<len1; i = i+1) {
			copystr1[j1++] = str1.charAt(i);
		}
		
		int[] copystr2 = new int[len2];
		int j2 = 0;
		for(int i=0; i<len2; i = i+1) {
			copystr2[j2++] = str2.charAt(i);
		}
		
		//정렬
		for(int i=0; i<len1; i++) {
			for(int j=i+1; j<len1; j++) {
				if(copystr1[i] > copystr1[j]) {
					int temp = copystr1[i];
					copystr1[i] = copystr1[j];
					copystr1[j] = temp;
				}
			}
		}
		
		for(int i=0; i<len2; i++) {
			for(int j=i+1; j<len2; j++) {
				if(copystr2[i] > copystr2[j]) {
					int temp = copystr2[i];
					copystr2[i] = copystr2[j];
					copystr2[j] = temp;
				}
			}
		}
		
		//비교
		boolean flag = true;
		for(int i=0; i<len1; i++) {
			if(copystr1[i] != copystr2[i]) {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			return str1 + "과 " + str2 + "는 애나그램입니다";
		}else {
			return str1 + "과 " + str2 + "는 애나그램이아닙니다";
		}

	}
	
	//GCCG 출력
	public static void practice4(String str1) {
		int i=0;
		for(int j=0; j<str1.length(); j = j+1) {
			
			if(i==0 && str1.charAt(j) == 'G') {
				i++;
			}else if(i==1 && str1.charAt(j) == 'C') {
				i++;
			}else if(i==2 && str1.charAt(j) == 'C') {
				i++;
			}else if(i==3 && str1.charAt(j) == 'G') {
				i++;
			}else {
				i=0;
			}
			
			if(i==0 && str1.charAt(j) == 'G') {
				i++;
			}
			
			if(i==4) {
				i=0;
				System.out.println("GCCG");
			}
		}
		
	}

	public static void main(String[] args) {
		//1번 문제
		String result1 = practice1("HellO World"); 
		System.out.println(result1);
		
		//2번 문제
		String result2 = practice2(" Hello World ");
		System.out.println(result2);
		
		//3번 문제
		String result3 = practice3("KeeP ", " peek");
		System.out.println(result3);
		
		//4번 문제
		practice4("GGCDGCCGDDGCCGCCGCCGDDCKGCCGKK");

	}

}
