package gmail.seol211112;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class DTO implements Serializable {
	private int num;
	private String name;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class SerializableMain {

	public static void main(String[] args) {
		
		ObjectOutputStream oos = null;
		
		try {
			//현재 디렉토리에 INSTANCE.txt 파일의 경로를 갖는 인스턴스 생성
			//System.out.println(Paths.get("").toAbsolutePath().toString());
			oos = new ObjectOutputStream(new FileOutputStream("./instance.txt"));
			
			
			List<DTO> list = new ArrayList<>();
			
			DTO dto = new DTO();
			dto.setNum(1);
			dto.setName("마빈해굴러");
			oos.writeObject(dto);
			list.add(dto);
			
			dto = new DTO();
			dto.setNum(2);
			dto.setName("그냥아무거나");
			oos.writeObject(dto);
			list.add(dto);
			
			oos.writeObject(list);
			
			//인스턴스 단위로 읽기
			ObjectInputStream ois = null;
			
			try {
				//현재 디렉토리의 instance.txt 파일의 내용을 읽을 수 있는
				//objectInputStream 인스턴스 생성
				ois = new ObjectInputStream(
						new FileInputStream("./instance.txt"));
				Object obj = ois.readObject();
				
				//Object 타입을 리턴받은 경우 수행할 작업
				list = (List<DTO>)obj;
				
				//DTO로 저장했으니까 DTO로 읽기
				for(DTO temp : list) {
					System.out.println(temp);
				}
				
				
			}catch(Exception e) {
				System.out.println(e.getLocalizedMessage());
			}finally {
				try {
					ois.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}finally {
			try {
				oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
