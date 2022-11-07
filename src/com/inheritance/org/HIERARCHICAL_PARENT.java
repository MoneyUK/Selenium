package com.inheritance.org;

public class HIERARCHICAL_PARENT {
	public void Television() {
		System.out.println("TELEVISON");
		System.out.println("REDMI");
		System.out.println("32 INCH");
		System.out.println("");
	}
	public void Laptop() {
		System.out.println("LAPTOP");
		System.out.println("HP");
		System.out.println("4BG RAM");
		System.out.println("");
}
	public static void main(String[] args) {
		HIERARCHICAL_PARENT obj = new HIERARCHICAL_PARENT();
		obj.Television();
		obj.Laptop();
	}
}

