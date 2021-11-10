import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DataFrameMapUse {

	public static void main(String[] args) {
		//Map을 이용해서 하나의 행동 표현하면 DTO 클래스가 필요없다
		//주의점은 key를 문자열로 작성하기에 key이름을 정확하게 기억할 필요가 있다
		//get을 이용해서 사용할 때 강제형 변환을 해주어야 한다
		List<Map<String, Object>> list = new ArrayList<>();

		//1개의 데이터를 생성해서 추가
		Map<String, Object> map = new HashMap<>();
		map.put("name", "SI");
		map.put("description", "다른 회사에서 의뢰한 시스템을 만들어주는 업무로 ERP 라고도 함");
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "Java");
		map.put("description", "프로그램을 만들기 위한 언어");
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "Database");
		map.put("description", "데이터를 효율적으로 관리하기 위한 SW");
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "Python");
		map.put("description", "애플리케이션을 구현하기 위해 사용하는 언어");
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "C++");
		map.put("description", "객체지향 C언어");
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "JavaScript");
		map.put("description", "웹 애플리케이션 개발용 언어");
		list.add(map);
		
		map = new HashMap<>();
		map.put("name", "Hadoop");
		map.put("description", "분산 DB");
		list.add(map);

		//전체 데이터 출력하기
		for(Map<String, Object> temp : list) {
			System.out.println(temp.get("name") + ":" + temp.get("description"));
		}
		
		System.out.println("================================");
		//일부분의 데이터 출력하기
		int i=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			//페이지당 2개씩 출력
			int size = i + 2;
			for(; i<size; i=i+1) {
				//데이터의 인덱스가 list의 데이터 개수와 같아지면 더 이상 읽을 필요 없다
				if(i == list.size()) {
					break;
				}
				System.out.println(list.get(i));
			}
			
			//무한 반복문 종료
			if(i == list.size()) {
				break;
			}
			
			System.out.println("다음 페이지 데이터는 ENTER를 누르면 보여집니다");
			sc.nextLine();
		}
		
		System.out.println("================================");
		//데이터 1개 가져오기
		System.out.println(list.get(1));
		
		System.out.println("================================");
		//데이터 정렬
		list.sort(new Comparator<Map<String, Object>>() {

			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				//형변환 필수
				String front = (String)o1.get("name");
				String back = (String)o2.get("name");
				return front.compareTo(back);
			}
			
		});
		
		for(Map <String, Object> temp: list) {
			System.out.println(temp.get("name"));
		}
		
	}

}
