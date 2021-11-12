package gmail.seol211112;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class DaumSocket {

	public static void main(String[] args) {

		//다른 장비와 통신 하기 위한 소켓과 주소
		Socket socket = null;
		InetAddress address = null;

		//입출력을 위한 클래스
		PrintWriter out = null;
		BufferedReader in = null;

		try {
			//통신하고자 하는 곳의 주소를 생성
			address = InetAddress.getByName("www.daum.net");

			//통신을 위한 소켓 생성
			socket = new Socket(address, 80);

			//읽고 쓰기 위한 스트림 생성
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out= new PrintWriter(socket.getOutputStream());

			//메시지 보내기
			out.println("GET http://www.daum.net");
			out.flush();

			//보내준 메시지 읽기
			while(true) {
				String line = in.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}

		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {

			try {
				out.close();
				in.close();
				socket.close();
			}catch(Exception e) {

			}
		}
	}

}
