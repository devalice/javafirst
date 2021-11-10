import java.util.HashMap;
import java.util.Set;

public class MapUse {

	public static void main(String[] args) {
		//key는 string으로 하고 value는 object로 하는 hashmap을 생성
		//value를 object로 하는 이유는 object에는 모든 종류의 데이터를 대입할 수 있어서
		//대신에 object로 된 데이터는 출력을 할 때를 제외하고는 강제 형 변환을 통해서
		//원래의 자료형으로 되돌려서 사용해야 함
		
		//1. hashmap을 생성
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", "adam");
		map.put("age", 50);
		map.put("age", 44); //age 데이터 수정
		
		String name = (String)map.get("name");
		int age = (Integer)map.get("age");
		
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
		
		//데이터 추가
		map.put("song", "hey mama");

		System.out.println("노래: "+ (String)map.get("song"));
		
		String [] albums = {"제네시스", "엑소더스"};
		map.put("album", albums);
		
		//System.out.println("노래: "+ (String)map.get("album"));
		
		//toString 메서드: 각 요소의 toString 메서드를 호출한 결과
		System.out.println(map);
		
		//없는 키를 출력하려고 하면 null
		System.out.println(map.get("hobby"));
		
		//데이터 삭제
		map.remove("album");
		map.put("album", null); //get으로 꺼내면 null이기 때문에 지운 것으로 간주. 남아는 있음
		System.out.println(map);
		
		//전체 데이터 순회 - key의 이름을 기억하지 않아도 된다
		Set<String> keys = map.keySet(); //모든 key를 가져온다
		for(String key : keys){
			System.out.println(key + ":" + map.get(key));
		}
	}

}
