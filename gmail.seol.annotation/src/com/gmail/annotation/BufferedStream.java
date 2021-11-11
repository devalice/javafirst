package com.gmail.annotation;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.PrintStream;

public class BufferedStream {

	public static void main(String[] args) {
		//파일에 바이트 단위로 버퍼를 이용해서 기록 - PrintStream
		PrintStream ps = null;
		//파일을 다루는 건 예외처리
		try {
			//상대 경로를 이용해서 기록할 파일 스트림을 생성
			//상대 경로에는 \가 없음
			//현재 작업 디렉토리에 버퍼스트림.txt 파일을 생성해서 기록
			ps = new PrintStream("./버퍼스트림.txt");

			//기록할 내용 만들기
			String str = "버퍼를 이용한 바이트 스트림";

			//기록 - 문자열을 기록하는 메서드가 존재
			ps.println(str);
		}catch(Exception e) {
			System.out.println("파일 경로가 제대로인지 확인하세요");
		}finally {
			ps.close();
		}
		
		//파일에서 바이트 단위로 버퍼를 사용해서 읽기 - BufferedInputStream
		BufferedInputStream bis = null;
		try {
			//절대 경로를 이용해서 생성하기
			//MS-Windows는 드라이브 이름부터 시작하고 디렉토리 구분기호는 \
			//다른 시스템은 / 부터 시작하고 디렉토리 구분기호는 /
			//컴퓨터마다 다르게 지정
			FileInputStream fis = new FileInputStream("C:\\workspace\\gmail.seol.annotation\\버퍼스트림.txt");
			
			//fis를 이용해서 버퍼를 사용하는 ByteInputStream 생성
			bis = new BufferedInputStream(fis);
			
			//한번에 읽기
			byte [] b =new byte[fis.available()];
			
			//읽어서 저장하기
			//read에 매개변수가 있으면 읽은 개수를 리턴
			int len = fis.read(b);
			
			//읽어낸 바이트 배열을 문자열로 만들기
			String result = new String(b,0,len);
			
			System.out.println(result);
			
		}catch(Exception e) {
			System.out.println("파일의 경로를 확인하세요!!!");
		}finally {
			
		}


	}

}
