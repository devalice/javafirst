import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) {
		//속성과 값을 문자열로 저장하는 인스턴스를 생성
		Properties group = new Properties();
		
		group.setProperty("name", "adam");
		group.setProperty("age", "44");
		
		//값을 저장
		System.out.println(group.getProperty("name"));
		//자바에서는 없는 속성을 읽으면 null
		System.out.println(group.getProperty("job"));
		
		//파일에 저장
		try {
			FileOutputStream fos = new FileOutputStream("./data.properties");
			group.store(fos, "comment");
			
			fos = new FileOutputStream("./data.xml");
			group.storeToXML(fos, "comment");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
