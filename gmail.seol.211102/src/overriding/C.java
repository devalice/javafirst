package overriding;

public class C extends P {

	@Override
	public void method() {
		/* 상위 클래스 메소드를 호출하지 않아도 오류는 안나지만, 기능 추가라는 오버라이딩 목적에 위반 */
		super.method(); 
		System.out.println("추가하고자 하는 기능");
	}

}
