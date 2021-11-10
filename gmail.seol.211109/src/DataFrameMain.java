import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DataFrameMain {

	public static void main(String[] args) {
		List<Team> list = new ArrayList<>();
		
		Team team = new Team();
		team.setTeamname("토트넘");
		team.setWin(5);
		team.setTie(1);
		team.setDefeat(5);
		team.getPlayers().add("손흥민");
		team.getPlayers().add("케인");
		list.add(team);
		
		team = new Team();
		team.setTeamname("첼시");
		team.setWin(3);
		team.setTie(2);
		team.setDefeat(6);
		team.getPlayers().add("하베르츠");
		team.getPlayers().add("마운트");
		list.add(team);
		
		team = new Team();
		team.setTeamname("웨스트 햄");
		team.setWin(8);
		team.setTie(2);
		team.setDefeat(6);
		team.getPlayers().add("안토니오");
		team.getPlayers().add("조우마");
		list.add(team);
		
		
		//데이터 전체 읽어오기
		for(Team t : list) {
			System.out.print(t.getTeamname()+"\t");
			System.out.print(t.getPoints()+"\t");
			for(String player : t.getPlayers()) {
				System.out.print(player + " ");
			}
			System.out.println();
		}
		
		//데이터 1개 가져오기
		System.out.println(list.get(0));
		
		//데이터 일부분 출력하기
		int i=0;
		for(i=0; i<2; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("데이터 정렬하기");
		//배열은 Arrays.sort List는 sort 메소드
		//Comparator 인터페이스를 구현해서 compare 메서드를 재정의
		//누구를 기준으로 정렬할 지 결정
		//스캐너로 숫자 받아서 1이면 팀이름 2는 승점의 내림차순해서 팀 이름만 출력
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		while(true) {
			System.out.println("1. 이름 오름차순 2. 승점 내림차순 3. 종료");
			String menu = sc.nextLine();
			
			if(menu.equals("1")) {
				list.sort(new Comparator<Team>() {
					@Override
					public int compare(Team o1, Team o2) {
						return o1.getTeamname().compareTo(o2.getTeamname());
					}					
				});
				
			}else if(menu.equals("2")) {
				list.sort(new Comparator<Team>() {
					@Override
					public int compare(Team o1, Team o2) {
						return o1.getPoints() - o2.getPoints();
					}					
				});
				
			}else if(menu.equals("3")) {
				System.out.println("종료");
				break;
				
			}else {
				System.out.println("잘못된 메뉴 선택");
				
			}
			
			//전체 데이터를 출력
			for(Team t : list) {
				System.out.println(t.getTeamname());
			}
			
		}
		
		//
		
	}

}
