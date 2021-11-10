package com.gmail.project_211101;

public class Person {
	private int num;
	private String name;
	private String phone;
	private String address;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//인스턴스를 문자열로 리턴해주는 매서드
	//출력하는 매서드에 인스턴스 이름을 대입하면 자동으로 호출해줌
	@Override
	public String toString() {
		return "Person [num=" + num + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
}
