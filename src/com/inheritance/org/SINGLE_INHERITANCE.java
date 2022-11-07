package com.inheritance.org;

public class SINGLE_INHERITANCE extends INHERITANCE {
	@Override
	public void supermarket() {
		super.supermarket();
		System.out.println("KIDS SECTION");

	}

	@Override
	public void saravanastores() {
		super.saravanastores();
		System.out.println("LADIES SECTION");

	}

	public static void main(String[] args) {
		SINGLE_INHERITANCE obj = new SINGLE_INHERITANCE();
		obj.supermarket();
		obj.saravanastores();

	}

}
