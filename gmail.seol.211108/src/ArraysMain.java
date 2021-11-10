import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		String[] soccers = {"반바스텐", "글리트", "리카르트"};
		
		System.out.println(Arrays.toString(soccers));
		
		//깊은 복사
		String [] copy = Arrays.copyOf(soccers, soccers.length);
		System.out.println(Arrays.toString(copy));
		
		copy[0] = "베르캄프";
		
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(soccers));
	}

}
