
public class DaemonThread {

	public static void main(String[] args) {
		
		Thread th = new Thread() {
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("자동 저장");
				}
			}
		};
		//th.setDaemon(true); //다른 스레드가 없으면 종료됨
		th.start();
		
		Thread th1 = new Thread() {
			public void run() {
				try {
					Thread.sleep(20000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(getName() + " 종료");
			}
		};
		
		th1.start();
		
		//무한 반복하는 내용의 스레드를 종료시킬 수 있음
		try {
			Thread.sleep(20000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(0);
		

	}

}
