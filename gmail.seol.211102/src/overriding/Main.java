package overriding;

public class Main {

	public static void main(String[] args) {
		//P Class의 method를 사용
		//메소드를 사용할 때 static이 붙었는지 안붙었는지 제일 먼저 확인
		P obj = new P();
		obj.method();
		System.out.println("====================");
		//P 클래스의 method의 기능이 부족하다고 판단해 C생성
		C obj2 = new C();
		obj2.method();
		
		P p = new P();
		p = new C(); //인스턴스 타입이 하위 클래스이면 가능.  
		
		C c = new C();
		//c = new P(); //C가 P클래스의 하위 클래스라 에러
		
		//c = (C)(new P()); //런타입 에러 발생
		//c = p;//컴파일러는 p가 참조하는 대상이 P 클래스의 인스턴스라고 단순화시켜서 생각. 컴파일 에러를 일으킨다.
		c = (C)p; //p에는 C가 대입되어 있어서 가능
	}

}
