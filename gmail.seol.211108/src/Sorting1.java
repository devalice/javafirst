import java.util.Arrays;
import java.util.Comparator;

public class Sorting1 {

	public static void main(String[] args) {
		String [] ar = {"아이린", "슬기", "조이", "예리", "웬디"};
		
		class Temp implements Comparator<String>{

			@Override
			public int compare(String o1, String o2) {
				//문자열을 내림차순 하기 위해서 순서를 변경해서 비교
				//순서대로 비교한 결과에 -1을 곱해도 됨
				return o2.compareTo(o1); //밑에와 결과 같음
				//return o1.compareTo(o2)*-1; 
			}
			
		}
		
		Arrays.sort(ar, new Temp());
		System.out.println(Arrays.toString(ar));
		
		Integer [] xr = {30,20,19,24,65,27};
		
		Arrays.sort(xr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(Arrays.toString(xr));

	}

}
