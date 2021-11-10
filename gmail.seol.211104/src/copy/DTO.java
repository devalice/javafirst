package copy;

public class DTO {
	private int num;     //번호를 저장할 속성
	private String name; //이름을 저장할 속성
	
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
	
	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object other) {
		DTO other1 = (DTO)other;
		if(this.num ==  other1.getNum() && this.name.equals(other1.getName())) {
			return true;
		}
		return false;
	}
	
	//내용을 복제해서 리턴
	public DTO Clone() {
		DTO other = new DTO();
		
		//현재 인스턴스의 내용을 새로 생성한 인스턴스에 복사
		other.num = num;
		//문자열은 새로 생성해서 복사 => 깊은 복사
		//other.name = new String(name);
		other.name = name;
		
		return other;
	}
	
	
}
