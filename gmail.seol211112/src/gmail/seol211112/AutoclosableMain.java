package gmail.seol211112;

import java.util.Scanner;

public class AutoclosableMain {

	public static void main(String[] args) {
		/**
		 * try() 안에서 생성된 인스턴스 중에서 
		 * autocloseable 인터페이스를 구현한 인스턴스는 마지막에  close를 자동으로 호출 
		 **/
		try (Scanner sc = new Scanner(System.in);){
			sc.nextInt();
		}catch(Exception e) {
			
		}

	}

}
