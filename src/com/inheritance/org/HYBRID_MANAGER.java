package com.inheritance.org;

public class HYBRID_MANAGER extends HYBRID_PLANTHEAD {
	@Override
	public void COMPANY() {
		super.COMPANY();
		System.out.println("COMPANY");
		System.out.println("FORD");
		System.out.println("MARAIMALI NAGAR");
		System.out.println( );
	}
	@Override
	public void SUPERMARKET() {
		super.SUPERMARKET();
		System.out.println("SUPERMARKET");
		System.out.println("KRISHNA  STORES");
		System.out.println("KIDS  SECTION");
		System.out.println( );	
	}
	public static void main(String[] args) {
		HYBRID_MANAGER obj = new HYBRID_MANAGER();
		obj.COMPANY();
		obj.SUPERMARKET();
		}
	}

