package rename_equals;

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
}
