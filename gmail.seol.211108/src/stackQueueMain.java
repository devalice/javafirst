import java.util.PriorityQueue;
import java.util.Stack;

public class stackQueueMain {

	public static void main(String[] args) {
		//문자열 저장하는 stack 생성
		Stack <String> stack = new Stack<>();
		//데이터 추가
		stack.push("김좌진");
		stack.push("홍범도");
		stack.push("안중근");
		stack.push("유관순");
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		//stack.pop(); //underflow
		
		//일반 큐는 ArrayList를 만들고 remove(0)
		//우선순위 큐는 데이터를 크기 순서대로 꺼내주는 큐
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.offer("KOREA");
		queue.offer("CHINA");
		queue.offer("USA");
		queue.offer("NEWZILAND");
		queue.offer("HOLLAND");
		
		System.out.println(queue.poll());
		
		for(String temp : queue) {
			System.out.println(temp);
		}
	}

}
