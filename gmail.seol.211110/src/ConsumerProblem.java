import java.util.ArrayList;
import java.util.List;

//공유 자원 클래스 - 진열대
class Product{
	List<Character> list;

	//생성자
	public Product() {
		list = new ArrayList<Character>();
	}

	//물건을 생산하는 메서드
	public synchronized void put(char ch) {
		list.add(ch);

		//물건을 생산한 후 알림을 준다 
		notifyAll();

		System.out.println(ch + "가 입고되었습니다.");

		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("현재 재고 수량: "+ list.size());
	}

	//물건을 소비하는 메서드
	public synchronized char get() {
		//물건을 소비하기 전에 창고를 확인해서 없으면 대기
		if(list.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		char ch = list.remove(0);
		System.out.println(ch + "가 출고 되었습니다.");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("현재 재고 수량: "+list.size());

		return ch;

	}

}

//생산자 스레드
class Producer extends Thread{
	private Product list;

	//생성자 - 외부에서 데이터 받아서 자신의 멤버 변수에 대입
	//DI(Dependency Injection) - 의존성 주입
	public Producer(Product list) {
		this.list = list;
	}

	public void run() {
		for(int i=65; i<=90; i++) {
			list.put((char)i);
		}
	}
}

//소비자 스레드
class Customer extends Thread{
	private Product list;

	public Customer(Product list) {
		this.list = list;
	}

	public void run() {
		for(int i=0; i<26; i++) {
			list.get();
		}
	}
}

public class ConsumerProblem {
	public static void main(String [] args) {

		//공유할 진열대 생성
		Product product = new Product();

		//생산자 스레드 생성 및 실행
		Producer p = new Producer(product);
		Customer c = new Customer(product);

		p.start();
		c.start();
		//=>소비자 스레드는 예외가 발생하고 생산자 스레드는 계속 작업을 수행함
		//=>소비자 스레드는 데이터가 없는 걸 가져 가려고 해서 ArrayIndexOutOfBoundException발생
		//=>이 문제를 해결하기 위해서는 작업을 수행하는 메서드 앞에 synchronized를 추가하고
		//		소비자는 물건이 없으면 기다리도록 wait 메서드를 호출한다
		//		생산자는 물건을 생성하고 나면 wait중인 스레드가 깨어날 수 있도록 notify()나 notifyAll을 호출
	}

}
