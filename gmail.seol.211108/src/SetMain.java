import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		TreeSet<String> songs = new TreeSet<String>();
		songs.add("한설희");
		songs.add("한설희"); //중복제거 
		
		//TreeSet은 크기 순으로 리턴
		for(String song : songs) {
			System.out.println(song);
		}
	}

}
