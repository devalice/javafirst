package gmail.seo.membermanagement;

public class Member {
	private String memberid;
	private String membername;
	private String membernickname;
	private String memberpassword;
	private int memberage;
	private String memberphone;
	
	
	//속성에 접근하기 위한 접근자 메소드
	public String getMemberid() {
		return memberid;
	}
	
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	
	public String getMembername() {
		return membername;
	}
	
	public void setMembername(String membername) {
		this.membername = membername;
	}
	
	public String getMembernickname() {
		return membernickname;
	}
	
	public void setMembernickname(String membernickname) {
		this.membernickname = membernickname;
	}
	
	public String getMemberpassword() {
		return memberpassword;
	}
	
	public void setMemberpassword(String memberpassword) {
		this.memberpassword = memberpassword;
	}
	
	public int getMemberage() {
		return memberage;
	}
	
	public void setMemberage(int memberage) {
		this.memberage = memberage;
	}
	
	public String getMemberphone() {
		return memberphone;
	}
	
	public void setMemberphone(String memberphone) {
		this.memberphone = memberphone;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
