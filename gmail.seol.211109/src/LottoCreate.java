import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoCreate {

	public static void main(String[] args) {
		//랜덤한 1~45 까지의 숫자 6개를 저장해서 순서대로 출력
		//6개의 중복되지 않은 데이터 저장
		//배열, List, Set, Map 중에 선택
		
		//HashSet: 무작위로 저장
		//LinkedHashSet: 저장할 때의 순서를 기억
		//TreeSet: 크기를 기억, 무작위 저장할 때는 treeset이 괜찮
		
		Set<Integer> lotto = new TreeSet<>();
		Random r =new Random();
		
		while(lotto.size() < 6) {
			lotto.add(r.nextInt(45)+1);
		}
		
		for(Integer su : lotto) {
			System.out.println(su);
		}
		
		
	}

}
