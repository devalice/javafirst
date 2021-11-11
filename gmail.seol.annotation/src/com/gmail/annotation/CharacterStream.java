package com.gmail.annotation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CharacterStream {

	public static void main(String[] args) {
		//문자 단위로 기록 - 버퍼를 사용: PrintWriter
		//파일의 경로를 설정 - 현재 디렉토리에 character.txt

		PrintWriter ps = null;

		try {
			//스트림 생성
			ps = new PrintWriter("./character.txt");

			//기록할 메시지
			String msg = "안녕하세요\n반갑습니다\n문자스트림입니다.";

			//기록
			ps.write(msg);

			//내용이 많을 때는 마지막 내용이 기록이 안될 수 있으므로 버퍼를 비워줍니다
			ps.flush();

		}catch(Exception e) {
			//서버에서는 메시지를 파일이나 데이터베이스에 기록 - 시간과 함께
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			String time = sdf.format(date);
			System.out.println(time + ": 파일 경로를 다시 확인하세요!!!"); 
		}finally {
			ps.close();
		}


		//줄 단위로 텍스트를 읽기
		//텍스트를 읽을 때 확인 사항 - BufferedReader
		//1. 경로 확인 - 현재 디렉토리에 character.txt
		//2. 한글 포함 여부 확인 - 인코딩 확인(읽은 후 글자가 깨지면 인코딩을 수정)
		//3. 파일의 크기가 크면 한 번에 읽지 못하거나 시간이 오래 걸리거나 컴퓨터가 버벅임
		
		BufferedReader br = null;
		
		try {
			//현재 디렉토리에 있는 character.txt 파일을 가지고 생성
			br= new BufferedReader(
					new InputStreamReader(
							new FileInputStream("./character.txt")));
			/***
			while(true) {
				String result = br.readLine();
				if(result == null) {
					break;
				}
				System.out.println(result);
			}
			 ***/

			//줄 단위로 읽어서 바로 출력하지 않고 변수에 저장
			String data = "";
			StringBuilder sb =new StringBuilder();
	
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//문자열에 문자열을 + 로 결합하면 메모리 낭비가 발생, 반복문 안에서 쓰지 말기!
				//data = data + line;
	
				//StringBuilder를 이용해서 추가
				sb.append(line);
				sb.append("\n");
		}
		//문자열로 변환
		data = sb.toString();
		System.out.println(data);

	}catch(Exception e) {
		System.out.println("파일 이름을 확인해보세요");
	}finally {
		try {
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

}
