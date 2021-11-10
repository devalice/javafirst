package gmail.seo.membermanagement;

import java.util.Scanner;

public class MemberController {

	public static void main(String[] args) {
		//콘솔로부터 입력받는 객체 만들기
		Scanner sc = new Scanner(System.in);
		
		//작업을 위한 인스턴스 생성
		MemberService member = new MemberServiceImp1();
		
		//무한 반복해서 작업하다가 7번을 누르면 종료하기
		
		final String REGISTER = "1";
		final String OUT      = "2";
		final String INFO     = "3";
		final String UPDATE   = "4";
		final String LOGIN    = "5";
		final String LOGOUT   = "6";
		final String EXIT     = "7";
		
		boolean flag = true;
		while(flag) {
			System.out.print("메뉴를 입력하세요: ");
			
			String menu = sc.nextLine(); //int로 받으면 튕김???
			
			switch(menu) {
			case REGISTER:
				member.memberregister(null);
				break;
			case OUT:
				member.memberout(null);
				break;
			case INFO:
				member.memberinfo(null, null);
				break;
			case UPDATE:
				member.memberupdate(null);
				break;
			case LOGIN:
				member.memberlogin(null, null);
				break;
			case LOGOUT:
				member.memberlogout();
				break;
			case EXIT:
				flag = false;
				break;
			default:
				System.out.println("잘못된 메뉴 선택");
				break;
			}
			
			/**
			 * if(menu.equals("7")){
			 * break;
			 * }
			 */
		}
		
		//스캐너 닫기
		sc.close();
	}

}
