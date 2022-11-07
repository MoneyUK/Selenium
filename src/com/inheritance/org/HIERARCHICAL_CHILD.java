package com.inheritance.org;

public class HIERARCHICAL_CHILD  extends HIERARCHICAL_PARENT{
	@Override
	public void Television() {
		super.Television();
		System.out.println("HAIER");
		System.out.println("42");
		System.out.println( );
	}
@Override
public void Laptop() {
	super.Laptop();
	System.out.println("DELL");
	System.out.println("6BG RAM");	
	System.out.println( );
}
public static void main(String[] args) {
	HIERARCHICAL_CHILD obj = new HIERARCHICAL_CHILD();
	obj.Television();
	obj.Laptop();
	
	
}
}
