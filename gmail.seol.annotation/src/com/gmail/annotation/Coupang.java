package com.gmail.annotation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Coupang {

	public static void main(String[] args) {
		//웹 로그 분석
		BufferedReader br = null;
		
		try {
			
			//br에 log.txt 파일을 연결해서 인스턴스 생성해서 대입
			//파일을 현재 작업 디렉토리에 복사해서 수행
			br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("./log.txt")));
			
			//파일의 내용을 전부 읽어서 출력
			String data = "";
			
			StringBuilder sb = new StringBuilder();
			
			//데이터 개수를 저장하기 위한 변수를 생성
			int cnt = 0;
			
			//접속한 IP개수를 세기 위한 Set 자료구조 생성 - 중복 제거 
			Set<String> ipSet = new HashSet<>();
			//합계를 구하기 위한 변수
			int trafficSum = 0;
			
			while(true) {
				//한 줄 읽기
				String line = br.readLine();
				
				if(line == null) {
					break;
				}
				
				sb.append(line);
				sb.append("\n");
				
				//데이터 개수 1증가
				cnt = cnt + 1;
				
				//읽어낸 문자열을 공백을 기준으로 분할
				String [] ar = line.split(" ");
				//System.out.println(ar[0] + ":" + ar[9]);
				
				//IP를 Set에 추가
				ipSet.add(ar[0]);
				
				
				/**
				 * 1번 방법
				if(ar[9].equals("-")) {
					trafficSum += Integer.parseInt(ar[9]);					
				}
				**/
				
				//2번 방법
				try {
					trafficSum += Integer.parseInt(ar[9]);
				}catch(Exception e) {
					
				}
				
				//ip 별 트래픽 합계 출력하기
				
			}
			
			//읽은 거 문자열로 변환
			data = sb.toString();
			//System.out.println(data);
			
			//데이터 개수 출력
			System.out.println("데이터 개수: "+ cnt);
			
			//IP 개수 출력
			System.out.println("ip 개수: "+ ipSet.size());
			
			//트래픽의 전체 합계를 출력
			System.out.println("트래픽 합계: "+ trafficSum);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("파일의 경로를 확인");
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
