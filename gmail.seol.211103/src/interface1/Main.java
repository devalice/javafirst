package interface1;

public class Main {

	public static void main(String[] args) {
		//2개의 클래스에 존재하는 메서드를 호출
		ProgressiveWeb browser = new MobileBrowser();
		browser.nextPage();
		
		browser = new PCBrowser();
		browser.nextPage();
		
		//browser = new ProgressiveWeb(); 추상클래스는 인스턴스 생성 불가
	}

}
