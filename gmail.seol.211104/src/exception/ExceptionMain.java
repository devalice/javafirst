package exception;

public class ExceptionMain {

	public static void main(String[] args) {
		int n = 10;
		int x = 0;
		
		try {
			System.out.println("result="+(n / x));
		}catch(ArithmeticException e) {
			System.out.println(e.getLocalizedMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getLocalizedMessage());
		}catch(Exception e) { 
			System.out.println(e.getLocalizedMessage());
		}finally {
			System.out.println("무조건 처리");
			System.out.println("주로 외부 자원 연결 해제 코드 작성");
		}
		
		System.out.println("계속 수행할 문장");
		
		int a = 10;
		
		try {
			Thread.sleep(1000);
			int b = 10;
			
		}catch(InterruptedException e) {
			e.printStackTrace();
			//try구문에서 만든 변수 사용 불가
		}
		
	}
	
}
