import java.util.LinkedHashMap;
import java.util.Set;

public class DTOAndMap {

	public static void main(String[] args) {
		//DTO를 이용해서 데이터를 생성
		DTO dto = new DTO();
		dto.setName("adam");
		dto.setAge(44);
		
		//출력
		System.out.println("이름: "+dto.getName());
		System.out.println("이름: "+dto.getAge());
		
		//DTO 단점: 멤버 변수나 함수 이름을 변경하면 함수 호출한 부분도 다 수정해줘야 함
		//Map 이용 - 출력할때 getName이나 getAge같은 특정 이름의 함수 사용할 필요가 없다
		//MVC 패턴
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("이름", "아담");
		map.put("age", 44);
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}

	}

}
