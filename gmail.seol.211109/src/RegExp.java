
public class RegExp {

	public static void main(String[] args) {
		
		String [] ar = {"abc", "acc", "addd", "Ads", "한aa", "1sf"};
		
		String pattern = "^[a-z].."; //. == 한 글자, 한글은 가 - 힣
		
		for(String str : ar) {
			System.out.println(str.matches(pattern));
		}
		
	}

}
