package copy;

public class Main {
	public static void main(String[] args) {
		DTO adam = new DTO();
		adam.setNum(1);
		adam.setName("adam");
		
		//DTO hunt = adam; //참조를 복사
		//hunt.setNum(2);
		
		
		//System.out.println(adam);
		//System.out.println(hunt);
		
		//복제
		DTO jessica = adam.Clone();
		jessica.setNum(12);
		jessica.setName("jessica");
		
		//복제를 했으므로 jessica의 데이터를 변경해도 원본에 영향 없음
		System.out.println(adam);
		System.out.println(jessica);
	}
}
