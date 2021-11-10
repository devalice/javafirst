package wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		//wrapper 인스턴스로 생성
		Double d = 32.4;

		//Wrapper타입을 기본형으로 변경할때 - 자동 변환
		double x = d.doubleValue();
		
		//문자열을 숫자로 변환 - 포멧이 맞지 않으면 NumberFormatException
		
		
		String s = 123 + ""; 
		
		/*
		 * 예전엔 메모리 낭비가 있어서 밑의 방식으로 했으나
		 * 지금은 아님
		 */
		//Integer i = 123;
		//s = i.toString();
		
		//Object 클래스의 인스턴스에 기본형 데이터가 들어 있는 경우
		//기본형으로 형 변환은 안된다
		//Wrapper Type으로 형 변환해서 대입해야 함
		Object o = 123;
		//int k = (int)o; //자바 하위 버전이나 웹 프로그래밍(자바 하위 버전)에서 에러
		int k = (Integer)o;
	}

}
