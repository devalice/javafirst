package gmail.seo.membermanagement;

//회원 관리 작업을 위한 인터페이스
public interface MemberService {
	//회원 가입을 위한 처리
	public boolean memberregister(Member member); //성공과 실패
	//회원 탈퇴를 위한 처리
	public boolean memberout(String password);
	//회원 정보 조회를 위한 처리
	public Member memberinfo(String id, String password);
	//회원 정보 수정을 위한 처리
	public boolean memberupdate(Member member);
	//로그인을 위한 처리
	public boolean memberlogin(String id, String password);
	//로그아웃을 위한 처리
	public void memberlogout();
}
