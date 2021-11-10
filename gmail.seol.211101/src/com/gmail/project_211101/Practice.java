package com.gmail.project_211101;

import javax.sound.midi.MidiSystem;

public class Practice {
	public static void staticMethod() {
		System.out.println("static 메서드");
	}
	
	public void disp() {
		System.out.println("매개변수가 없고 리턴타입도 없는 memeber 메소드");
	}
	
	public void sum(int n) {
		int tot = 0;
		for(int i=1; i<n+1; i++) {
			tot = tot + 1;
		}
		System.out.println("1부터 n까지의 합: "+ tot);
	}
	
	//2부터 1000까지의 소수의 개수
	public int prime() {
		int cnt = 0;
		for(int i=2; i<=1000; i++) {
			for(int j=0; j<i/2; j++) {
				
			}
			boolean flag = true;
			break;
		}
		return cnt;
	}

}
