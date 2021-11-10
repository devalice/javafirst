package java_211105;

public class SystemMethod {

	public static void main(String[] args) {
		//운영체제 이름 확인
		System.out.println("OS:"+System.getProperty("os.name"));
		System.out.println("자바버전:"+System.getProperty("java.version"));

		//i++ vs i=i+1 비교
		long start = System.nanoTime();
		int temp = 0;
		for(int i=0; i<1000000000; i++) {
			temp = temp+i;
		}
		long end = System.nanoTime();
		System.out.println("작업 수행에 걸린 시간: "+ (end - start));

		start = System.nanoTime();
		temp = 0;
		for(int i=0; i<1000000000; i=i+1) {
			temp = temp+i;
		}
		end = System.nanoTime();
		System.out.println("작업 수행에 걸린 시간: "+ (end - start));



	}

}
