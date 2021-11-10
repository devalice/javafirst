import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {
	public static void main(String [] args) {
		//ArrayList와 LinkedList 속도 비교

		//ArrayList LinkedList 생성
		ArrayList <Integer>a1 = new ArrayList<>();
		LinkedList <Integer>a2 = new LinkedList<>();

		a1.add(1);
		a1.add(3);

		a2.add(1);
		a2.add(3);

		long start = System.nanoTime();
		//1,000,000개 데이터 2번째에 삽입
		for(int i=0; i<100000; i=i+1) {
			a1.add(1, 2);
		}
		long end = System.nanoTime();

		System.out.println("ArrayList 추가 시간: "+(end - start));

		start = System.nanoTime();
		//1,000,000개 데이터 2번째에 삽입
		for(int i=0; i<100000; i=i+1) {
			a2.add(1, 2);
		}
		end = System.nanoTime();

		System.out.println("LinkedList 추가 시간: "+(end - start));

		start = System.nanoTime();
		for(int i=0; i<100000; i++) {
			a1.get(i);
		}
		end = System.nanoTime();

		System.out.println("ArrayList 읽기 시간: "+(end - start));
		
		start = System.nanoTime();
		//1,000,000개 데이터 2번째에 삽입
		for(int i=0; i<100000; i=i+1) {
			a2.get(i);
		}
		end = System.nanoTime();

		System.out.println("LinkedList 읽기 시간: "+(end - start));




	}
}
