package com.inheritance.org;

public class HYBRID_PLANTHEAD extends HYBRID_COMPANY{
	@Override
	public void COMPANY() {
		super.COMPANY();
		System.out.println("COMPANY");
		System.out.println("LEAR");
		System.out.println("MAHENDIRA CITY");
		System.out.println( );
	}
	@Override
	public void SUPERMARKET() {
		super.SUPERMARKET();
		System.out.println("COMPANY");
		System.out.println("LEAR");
		System.out.println("MAHENDIRA CITY");
		System.out.println( );
		}
	public static void main(String[] args) {
		HYBRID_PLANTHEAD obj = new HYBRID_PLANTHEAD();
		obj.COMPANY();
		obj.SUPERMARKET();
	}
	}
