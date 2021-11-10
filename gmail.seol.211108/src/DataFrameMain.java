import java.util.ArrayList;
import java.util.Comparator;

public class DataFrameMain {

	public static void main(String[] args) {
		//1. DataFrame 만들기
		//boolean, byte, short, char, int, long, float, double, String
		//- 가로의 각 항목
		
		//DTO Class - 가로
		
		//배열, ArrayList, LinkedList - 세로
		
		ArrayList<DTO> ar = new ArrayList<>();
		
		DTO dto = new DTO();
		dto.setName("아이린");
		dto.setAge(30);
		ar.add(dto);
		
		dto = new DTO();
		dto.setName("슬기");
		dto.setAge(27);
		ar.add(dto);
		
		dto = new DTO();
		dto.setName("웬디");
		dto.setAge(28);
		ar.add(1, dto);
		
		dto = new DTO();
		dto.setName("조이");
		dto.setAge(28);
		ar.add(dto);
		
		dto = new DTO();
		dto.setName("예리");
		dto.setAge(21);
		ar.add(dto);
		
		//모든 데이터 확인
		System.out.println(ar);
		
		System.out.println("======================");
		//빠른 순회
		for(DTO temp : ar) {
			System.out.println(temp);
		}
		
		System.out.println("======================");
		//데이터 개수 - size()
		//데이터 1개 가져오기 - get(int index)
		int len = ar.size();
		for(int i=0; i<len; i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("======================");
		//데이터 수정 - set(int index, Data data)
		dto = new DTO();
		dto.setName("예리");
		dto.setAge(22);
		ar.set(4, dto);
		
		for(DTO temp : ar) {
			System.out.println(temp);
		}
		
		System.out.println("======================");
		//데이터 삭제 - remove(int index)
		//ar.remove(1);
		for(DTO temp : ar) {
			System.out.println(temp);
		}
		
		System.out.println("======================");
		//데이터 정렬 - sort(List list, Comparator comparator)
		
		ar.sort(new Comparator<DTO>() {

			@Override
			public int compare(DTO o1, DTO o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		for(DTO temp : ar) {
			System.out.println(temp);
		}
		
	}

}
