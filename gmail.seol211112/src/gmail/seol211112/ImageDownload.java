package gmail.seol211112;

import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownload {

	public static void main(String[] args) {
		try {
			
			//다운로드 받을 URL 생성
			URL url = new URL("https://w.namu.la/s/6ea6894f9e003b6b7de6cb437cb57df48441e74f8939653ffb860ed2f7f2845e999170c08aec2ef9aa59c84b689505aa54b863a1744105a08f9a26cdc514e1daa757e6c88157897dcc6eb1a8435ead166085004c083fa4ac1dad84f0a4989c25");
		
			//연결 객체 생성
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			
			//옵션 설정
			con.setConnectTimeout(30000);
			con.setUseCaches(false);
			
			//이미지 파일이므로 BufferedInputStream 생성
			BufferedInputStream bis = new BufferedInputStream(
										con.getInputStream());
			
			//파일에 기록할 스트림을 생성
			PrintStream ps = new PrintStream("./사탕.jpg");
			
			while(true) {
				//버퍼를 생성
				byte [] b = new byte[512]; //약 200글자 정도
				
				//버퍼 크기 만큼 읽기
				int len = bis.read(b);
				
				if(len <= 0) {
					break;
				}
				//읽은 데이터를 기록 - 읽은 만큼만 기록
				ps.write(b , 0, len);
			}
			
			ps.flush();
			ps.close();
			
			bis.close();
			con.disconnect();
		
		
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
