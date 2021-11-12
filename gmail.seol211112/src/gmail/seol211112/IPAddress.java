package gmail.seol211112;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {

	public static void main(String[] args) {
		InetAddress localhost;
		try {
			localhost = InetAddress.getLocalHost();
			System.out.println(localhost);
			
			//naver의 IP 정보
			InetAddress [] naver = InetAddress.getAllByName("www.google.com");
			
			for(InetAddress n : naver) {
				System.out.println("naver: "+ n.toString());
				}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}		
	}

}
