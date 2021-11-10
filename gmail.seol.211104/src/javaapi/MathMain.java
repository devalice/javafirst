package javaapi;

import java.util.*;

public class MathMain {

	public static void main(String[] args) {
	 System.out.println( Math.random() );
	 
	 Random random = new Random();
	 System.out.println( random.nextInt(100) );
	 
	 
	 System.out.println(Calendar.DATE);
	 List<String> list = new ArrayList<String>(); 
	 
	 try {
		 Thread.sleep(3000);
	 }catch(IllegalArgumentException e) {
		 e.printStackTrace();
	 } catch (InterruptedException e) {
		e.printStackTrace();
	}finally {
		 System.out.println("3초 끝");
	 }
	 
	 //java.lang.Runtime 클래스는 모든 멤버가 static이 아니므로 인스턴스를 생성해야한다.
	 //abstract interface도 아님.
	 Runtime runtime = Runtime.getRuntime();
	 
	 
	}

}
