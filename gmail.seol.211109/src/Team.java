import java.util.ArrayList;
import java.util.List;

public class Team {

	private String teamname;
	private int count;
	private int win;
	private int tie;
	private int defeat;
	private int points;
	
	//데이터 목록
	private List<String> players;
	
	//메모리 할당을 생성자에서 미리 해주면 외부에서 발생하는 NullpointerException 방지 가능
	public Team() {
		//선수 명단을 저장할 리스트에 메모리 할당
		players = new ArrayList<>();
	}
	
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	
	public int getTie() {
		return tie;
	}

	public void setTie(int tie) {
		this.tie = tie;
	}

	public int getDefeat() {
		return defeat;
	}
	public void setDefeat(int defeat) {
		this.defeat = defeat;
	}
	public int getPoints() {
		//파생 속성은 가져오기 전에 계산
		points = win*3 + tie*1;
		return points;
	}
	public List<String> getPlayers() {
		return players;
	}
	public void setPlayers(List<String> players) {
		this.players = players;
	}
	
	@Override
	public String toString() {
		return "Team [teamname=" + teamname + ", count=" + count + ", win=" + win + ", defeat=" + defeat + ", points="
				+ points + ", players=" + players + "]";
	}

}
