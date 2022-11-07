package com.inheritance.org;

public class HIERARCHICAL_CHILD_1 extends HIERARCHICAL_CHILD{
	@Override
	public void Television() {
		super.Television();
		System.out.println("SAMSUNG");
		System.out.println("64");
		System.out.println( );
	}
@Override
public void Laptop() {
	super.Laptop();
	System.out.println("LENOVO");
	System.out.println("13 INCH");
	System.out.println( );
}
public static void main(String[] args) {
	HIERARCHICAL_CHILD_1 obj= new HIERARCHICAL_CHILD_1();
	obj.Television();
	obj.Laptop();
	}
}
