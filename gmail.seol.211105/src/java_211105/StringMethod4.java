package java_211105;

public class StringMethod4 {

	public static void main(String[] args) {
		int x = 10;
		int y = 200;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("================");
		System.out.printf("%3d\n", x);
		System.out.printf("%3d\n", y);
		
		System.out.println("================");
		System.out.printf("%03d\n", x);
		System.out.printf("%03d\n", y);
		
		System.out.println("================");
		double d = 12.8976524;
		System.out.printf("%.2f\n", d);
		
		System.out.println("================");
		String message = String.format("%.2f\n", d);
		System.out.printf(message);
		
		System.err.println("안뇽");
		
	}

}
