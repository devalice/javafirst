import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int [] ar = {20, 30, 50, 10, 70, 90, 80};
		
		System.out.println(Arrays.binarySearch(ar, 30));
		
		Arrays.sort(ar);
		
		System.out.println(Arrays.binarySearch(ar, 30));
		
		
	}

}
