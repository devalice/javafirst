package com.gmail.project_211028;

public class Toggle {

	public static void main(String[] args) {
		/*******************
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
			}

			if(i%2 == 0) {
				System.out.println("On");
			}else {
				System.out.println("Off");
			}
		}
		******************/
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			if(i % 5 == 0) {
				System.out.println("요미크론");
			}else if(i % 5 ==1) {
				System.out.println("라투");
			}else if(i % 5 ==2) {
				System.out.println("다크스펙터");
			}else if(i % 5 ==3) {
				System.out.println("요미크론");
			}else if(i % 5 ==4) {
				System.out.println("다크스펙터");
			}
		}
	}
	
}
