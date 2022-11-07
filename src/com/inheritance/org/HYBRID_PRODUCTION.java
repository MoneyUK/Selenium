package com.inheritance.org;

public class HYBRID_PRODUCTION extends HYBRID_MANAGER {
	@Override
	public void COMPANY() {
		super.COMPANY();
		System.out.println("COMPANY");
		System.out.println("BMW");
		System.out.println("PUDUCHERRY");
		System.out.println( );
	}
	@Override
	public void SUPERMARKET() {
		super.SUPERMARKET();
		System.out.println("SUPERMARKET");
		System.out.println("PRAWIN STORES");
		System.out.println("SOAP  SECTION");
		System.out.println( );
	}
	public static void main(String[] args) {
		HYBRID_PRODUCTION obj = new HYBRID_PRODUCTION();
		obj.COMPANY();
		obj.SUPERMARKET();
			}
	}

