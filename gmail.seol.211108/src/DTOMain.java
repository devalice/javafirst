import java.util.Arrays;
import java.util.Comparator;

public class DTOMain {

	public static void main(String[] args) {
		//DTO 클래스의 인스턴스 4개를 저장할 수 있는 배열을 생성
		DTO [] ar = new DTO[4];
		
		ar[0] = new DTO();
		ar[0].setName("카리나");
		ar[0].setAge(19);
		
		ar[1] = new DTO();
		ar[1].setName("지젤");
		ar[1].setAge(19);
		
		ar[2] = new DTO();
		ar[2].setName("윈터");
		ar[2].setAge(20);
		
		ar[3] = new DTO();
		ar[3].setName("닝닝");
		ar[3].setAge(19);
		
		//배열의 데이터 정렬은 Arrays.sort 메서드에 배열을 대입하고 Comparator 인터페이스를
		//이용해서 원하는 비교 메서드를 구현하면 배열의 데이터가 정렬
		Arrays.sort(ar, new Comparator<DTO>() {

			@Override
			public int compare(DTO o1, DTO o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		
	}

}
