
public class ThreadMain {

	public static void main(String[] args) {

		Thread th3 = new Thread() {
			public void run() {
				for(int i=0; i<10; i=i+1) {
					try {
						Thread.sleep(10);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("스레드 3");
				}
			}
		};

		th3.start();
	}

}
