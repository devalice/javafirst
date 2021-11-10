package com.gmail.project_211101;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setNum(1);
		p1.setName("박문석");
		p1.setPhone("01037901997");
		p1.setAddress("양천구 목동");
		
		System.out.println(p1.getNum());
		System.out.println(p1.getName());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAddress());
		
		System.out.println(p1);
		
		//동일한 모양의 데이터를 여러 개 사용하고자 할 때는 배열이나 List를 생각
		//배열(크기가 고정)이나 List(크기를 변경시킬 수 있음)를 생각
		Person [] contacts = new Person[3];
		
		//각각의 공간을 생성
		for(int i=0; i<contacts.length; i++) {
			contacts[i] = new Person();
		}
		
		contacts[0].setNum(1);
		contacts[0].setName("박문석");
		contacts[0].setPhone("01037901997");
		contacts[0].setAddress("양천구 목동");
		
		contacts[1].setNum(2);
		contacts[1].setName("제시카");
		contacts[1].setPhone("01012345678");
		contacts[1].setAddress("뉴질렌드 크라이스처지");
		
		contacts[2].setNum(3);
		contacts[2].setName("헌트");
		contacts[2].setPhone("01057891256");
		contacts[2].setAddress("뉴질렌드 크라이스처지");
		
		for(Person person : contacts) {
			System.out.println(person);
		}
	}

}
