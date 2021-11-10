package com.gmail.project_211101;

public class StaticTest {
	    public static void main(String[] args) {
	        Integer a = 10;
	        System.out.println("Before: " + a);
	        changeInteger(a);
	        System.out.println("After: " + a);
	        
	        /* 
	         * Integer는 Wrapper class로 Immutable이다(불변). Integer 클래스를 까보면
	         * 내부에서 사용하는 실제 값인 value라는 변수가 final로 선언 되어 있다.
	         */
	        
	    }

	    public static void changeInteger(Integer param) {
	        param += 10;
	    }
}
