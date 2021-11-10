

class ShareData implements Runnable{
	private int result;
	private int idx;

	public int getResult() {
		return result;
	}

	//1번 방법
	private synchronized void sum() {
		for(int i=0; i<1000; i++) {
			idx = idx + 1;
			try {
				Thread.sleep(1);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			result = result + idx;
		}

	}


	//2번 방법
	/***
	private void sum() {
		for(int i=0; i<1000; i++) {
			synchronized(this) {
				idx = idx + 1;
				try {
					Thread.sleep(1);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				result = result + idx;
			}
		}

	}
	 ***/
	
	//스레드로 동작할 메소드
	public void run() {
		sum();
	}

}


public class Mutex {

	public static void main(String[] args) {
		ShareData sh = new ShareData();
		//공유 데이터를 가지고 스레드 생성
		Thread th1 = new Thread(sh);
		Thread th2 = new Thread(sh);

		th1.start();
		th2.start();

		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(sh.getResult());
		//=>2000번 idx를 증가시키면서 더해야 하므로 1부터 2000까지의 합이 나와야 하는데
		//그렇지 않고 실행할 때마다 다른 결과를 만들어 낸다
		//ShareData를 공유해서 스레드 2개를 만들었고 idx를 수정한 후 result에 더하기 전에
		//sleep이 호출되어 다른 스레드에게 제어권이 넘어가고 그 스레드에서 idx를 수정해버리기 때문에 발생
		//위와 같은 문제 해결
		//1. 메서드의 결과형 앞에 synchronized 추가- 이 메서드가 수행중인 동안은 다른 메서드가 작업 수행 불가

		//2. 한번에 실행되어야 하는 영역을 synchronized 블럭으로 만드는 것인데
		//synchronized(공유객체){}로 묶음. 이 경우는 이 블럭에진입한 경우 공유객체를 동시에 수정할 수
		//없도록 동기화 블럭을 만들어 준다.
		//위에는 블럭이 끝날때까지 대기해야하지만 밑에는 {}
		//동기화 메서드를 만드는 것도 효율적인 방식.
	}

}
