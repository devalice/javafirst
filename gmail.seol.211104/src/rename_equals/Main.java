package rename_equals;

public class Main {

	public static void main(String[] args) {
		DTO obj1 = new DTO();
		obj1.setNum(1);
		obj1.setName("adam");
		
		DTO obj2 = new DTO();
		obj2.setNum(1);
		obj2.setName("adam");
			
		System.out.println(obj1.equals(obj2));
		
		int x = 100;
		int y = x;   //x를 복사한 것이 아닌 x가 가진 데이터인 100을 y가 가리키도록 한 것
		
		y = 200;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		int [] ar = {100,200,300};
		int [] br = ar;
		
		br[0] = 123;
		
		System.out.println("ar[0]: "+ar[0]);
		System.out.println("br[0]: "+br[0]);

	}

}
