package com.gmail.project_211026;

public class Mod {

	public static void main(String[] args) {
		int i = 0;
		//3가지 동작을 1초마다 번갈아 가면서 수행
		while(true) {
			try {
				Thread.sleep(100);
			}catch(Exception e) {
			
			}
			int mod = i % 4;
			if(mod == 0) {System.out.println("빨강");}
			try {
				Thread.sleep(100);
			}catch(Exception e) {
			
			}
			if(mod == 2) {System.out.println("주황");}
			try {
				Thread.sleep(100);
			}catch(Exception e) {
			
			}
			if(mod == 1) {System.out.println("파랑");}
			try {
				Thread.sleep(100);
			}catch(Exception e) {
			
			}
			if(mod == 2) {System.out.println("녹색");}
				i++;
			}
		}
	}
