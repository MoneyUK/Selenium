package com.polymorphisim.org;

public class METHOD_OVERLOADING {
	
	public void laptop() {
		System.out.println("HP");
		
	}
	public void laptop1(int a) {
		System.out.println("DELL");
		
	}
	public void laptop2(int a,char b) {
		System.out.println("LENOVA");
	}
	public void laptop3(String c) {
		System.out.println("HASEE");

	}
	public static void main(String[] args) {
		METHOD_OVERLOADING obj= new METHOD_OVERLOADING();
		obj.laptop();
		obj.laptop1(2);
		obj.laptop2(3, 'k');
		obj.laptop3("UDAY");
		
	}
}
	

