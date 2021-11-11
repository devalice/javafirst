package com.gmail.annotation;

import java.lang.reflect.Method;

public class Mymain {
	public static void main(String[] args) {
		Method[] methodList=Myservice.class.getMethods();
		
		for(Method m : methodList) {
			if(m.isAnnotationPresent(Myannotation.class)) {
				System.out.println(m.getName());
				Myannotation annotation=m.getDeclaredAnnotation(Myannotation.class);
				
				String value=annotation.value();
				int number=annotation.number();
				for(int i=0;i<number;i++) {
					System.out.print(value);
				}
				System.out.println();				
			}
		}
	}
}
