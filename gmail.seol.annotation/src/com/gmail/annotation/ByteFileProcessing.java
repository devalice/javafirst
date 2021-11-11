package com.gmail.annotation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileProcessing {

	public static void main(String[] args) {
		//출력할 파일 스트림 생성
		//현재 작업 디렉토리에 bytefile.txt로 실행
		//뒤에 true를 설정하면 이어서 기록
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("./bytefile.txt");
			//기록할만한 문자열을 생성
			String str = "안녕하세요 반갑습니다. AI 기반 응용 소프트웨어 과정에 참석한 한설희입니다.";
			//파일에 바이트 단위로 기록
			//문자열을 바이트 배열로 변경해서 기록
			fos.write(str.getBytes());
		}catch(Exception e) {
			System.out.println("파일의 경로를 확인해보세요!");
		}finally {
			try {
				fos.close(); //try~catch~finally는 서로 다른 블록
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		FileInputStream fis = null;
		try {
			//파일을 바이트 단위로 읽기 위한 스트림을 생성
			fis = new FileInputStream("./bytefile.txt");
			//읽어서 저장할 수 있는 배열을 생성
			
			//한 번에 읽고자 하는 경우
			byte [] b = new byte[fis.available()];
			
			//b만큼 읽어내기
			int len = fis.read(b);
			if(len <= 0) {
				System.out.println("읽은 데이터가 없음");
			}else {
				//바이트 배열을 문자열로 변환
				String str = new String(b);
				System.out.println(str);
			}
			
			
		}catch(Exception e) {

		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
