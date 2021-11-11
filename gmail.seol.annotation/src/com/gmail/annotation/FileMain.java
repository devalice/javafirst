package com.gmail.annotation;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) {
		File f = new File("C:\\workspace\\gmail.seol.annotation\\src\\com\\gmail\\annotation\\FileMain.java");
		
		if(f.exists()) {
			System.out.println("파일이 존재합니다.");
			//파일의 마지막 수정 시간 - epoch time
			long time = f.lastModified();
			Date date = new Date(time);
			
			//날짜를 원하는 문자열로 만들기
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			System.out.println(time);
			System.out.println(date);
			//System.out.println(result);
			//파일의 크기를 출력 - KB 바이트 단위 : KB - 1024Byte
			long len = f.length();
			System.out.println("파일의 크기:"+(len/1024) + "KB");
			
			//상대 경로인 현재 디렉토리의 절대 경로를 확인
			f = new File("./");
			System.out.println(f.getAbsolutePath());
			
			//현재 디렉토리의 파일을 복사하고 수행
			f = new File("./1025.txt");
			System.out.println(f.exists());
			
		}else {
			System.out.println("파일이 존재하지 않습니다.");
		}

	}

}
