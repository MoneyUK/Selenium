package com.abstracts.org;

public class ABSTRACT_1 extends ABSTRACT {
	@Override
	public void items() {
		super.items();

	}
	@Override
	void laptop() {
System.out.println("DELL");		
	}

	@Override
	void watch() {
System.out.println("ROLEX");		

	}

	@Override
	void tv() {
		System.out.println("SAMSUNG")	;
		
	}
public static void main(String[] args) {
	ABSTRACT_1 obj =new ABSTRACT_1();
	obj.items();
	obj.laptop();
	obj.watch();
	obj.tv();
	
}
}
