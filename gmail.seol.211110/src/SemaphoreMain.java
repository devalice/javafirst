import java.util.concurrent.Semaphore;

class SemaphoreThread extends Thread{
	Semaphore semaphore;
	
	public SemaphoreThread(Semaphore semaphore) {
		this.semaphore = semaphore;
	}
	
	public void run() {
		try {
			semaphore.acquire(); //열쇠 취득
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(getName());
		
		semaphore.release(); //열쇠 반납
	}
}

public class SemaphoreMain {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(3); //총 3개의 열쇠
		
		//Semaphore semaphore = new Semaphore(Runtime.getRuntime().availableProcessors()); //코어 개수

		//3개씩 동시에 수행됨 - 예약 시스템(동시에 들어올 수 있는 수)
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		new SemaphoreThread(semaphore).start();
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		
		//잔액조회
		int balance = 1000;
		final int read = balance;

		
	}

}
