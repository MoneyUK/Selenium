package com.inheritance.org;

public class HIERARCHICAL_CHILD_2  extends HIERARCHICAL_CHILD_1{
	@Override
	public void Television() {
		super.Television();
		System.out.println("REDMI");
		System.out.println("SMART TV");
		System.out.println() ;
	}
@Override
public void Laptop() {
	super.Laptop();
	System.out.println("HP");
	System.out.println("I5 GEN");
	System.out.println( );
	}
public static void main(String[] args) {
	HIERARCHICAL_CHILD_2 obj =new HIERARCHICAL_CHILD_2();
	obj.Television();
	obj.Laptop();
}
}
