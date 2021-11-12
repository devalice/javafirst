package gmail.seol211112;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiver {

	public static void main(String[] args) {
		// UDP 전송에 사용할 데이터
		DatagramPacket packet = null;
		//멀티캐스트에 전송에 사용할 소켓
		MulticastSocket socket = null;
		
		try {
			//포트 매개변수
			socket = new MulticastSocket(10000);
			
			//참여할 IP 생성
			InetAddress address = InetAddress.getByName("224.128.1.5");
			
			//그룹에 참여
			socket.joinGroup(address);
			
			//다른 사람들의 메세지를 보기 위해서 방화벽 풀어놔야함
			
			//무한반복해서 읽기
			while(true) {
				//데이터를 저장할 버퍼 생성
				byte [] b = new byte[512];
				packet = new DatagramPacket(b, b.length);
				
				//데이터 받기
				socket.receive(packet);

				//데이터 해석
				String msg = new String(b, 0, packet.getLength()); //읽은만큼만 문자열로 만들기
				//System.out.println(msg.trim()) 읽은만큼만 문자열로 만들기
				
				System.out.println(msg); 
			}
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			socket.close();
		}
		

	}

}
