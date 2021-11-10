import java.util.HashMap;
import java.util.Map;

public class Matrix {

	public static void main(String[] args) {
		
		//문제점 - 팀이 늘어났을 경우, if문 추가해줘야 함 
		String [] hipass = {"배유나", "문정원", "박정아"};
		String [] kixx = {"강소휘", "안혜진"};
		
		//2개의 배열을 하나의 배열로 생성 - 동일한 성격을 갖는 데이터는 하나로 관리
		String [][] volleyballs = {hipass, kixx};
		
		//배열은 인덱스로 데이터를 찾아간다
		/***
		for(String[] players : volleyballs) {
			for(String player : players) {
				System.out.println(player + "\t");
			}
			System.out.println();
		}
		***/
		
		//변할 가능성이 있는 데이터를 2차원 배열로 만드는 건 바람직하지 못함
		//1차원 배열을 Map에 저장한 후 다시 배열을 만들기
		//Map 안에 데이터의 특징을 저장할 수 있기 때문에
		//배열의 데이터가 변경이 되더라도 출력 부분을 수정할 필요가 없다
		Map<String, Object> map1 = new HashMap<>();
		map1.put("name", "도로공사");
		map1.put("data", hipass);
		
		Map<String, Object> map2 = new HashMap<>();
		map2.put("name", "");
		map2.put("data", kixx);
		
		Map<String, Object> map3 = new HashMap<>();
		map3.put("name", "");
		map3.put("data", hipass);
		
		Map [] maps = {map1, map2, map3};
		
		for(Map map : maps) {
			System.out.print(map.get("name") + "\t");
			
			//배열 꺼내기
			String [] ar = (String [])map.get("data");
			for(String player : ar) {
				System.out.print(player + "\t");
			}
			System.out.println();
		}
		
		
		
	}

}
