package gmail.seol211112;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			System.out.println("전송할 메시지: ");
			Scanner sc = new Scanner(System.in);
			String msg = sc.nextLine();
			//글자 깨지면 window - prefereneces - workspace에서 인코딩 설정 (utf-8)
			//서버가 아닌 클라이언트에서 바꿔줘야함
			
			//메세지를 보낼 장비 IP
			InetAddress address = InetAddress.getByName("192.168.10.28");
			socket = new Socket(address, 9000);
			
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println(msg);
			pw.flush();

			pw.close();
			sc.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			try {
			socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
