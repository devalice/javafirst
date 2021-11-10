package gmail.seol.project_211102_1;

//super 클래스를 상속받은 서브 클래스
public class Sub extends Super {
	
	public void subMethod() {
		//상위 클래스의 private 멤버는 하위 클래스에서 접근이 안된다
		//privateMethod();
		
		//상위 클래스의 package 멤버는 동일한 패키지면 접근 가능
		packageMethod();
		
		//상위 클래스의 protected 멤버는 하위 클래스에서 접근 가능
		protectedMethod();
		
		//상위 클래스의 public 멤버는 하위 클래스에서 접근 가능
		publicMethod();
		
	}

}
