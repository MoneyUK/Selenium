package com.inheritance.org;

public class HYBRID_QUALITY extends HYBRID_PRODUCTION {
	@Override
	public void COMPANY() {
		super.COMPANY();
		System.out.println("COMPANY");
		System.out.println("FERRARI");
		System.out.println("LONDON");
		System.out.println( );
	}
	@Override
	public void SUPERMARKET() {
		super.SUPERMARKET();
		System.out.println("SUPERMARKET");
		System.out.println("PRABU STORES");
		System.out.println("BISCUIT SECTION");
		System.out.println( );
		}
	public static void main(String[] args) {
		HYBRID_QUALITY obj = new HYBRID_QUALITY();
		obj.COMPANY();
		obj.SUPERMARKET();
		
		
	}
}
