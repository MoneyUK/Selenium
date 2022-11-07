package com.inheritance.org;

public class FINAL_INHERTIANCE implements MULTIPLE_INHERITANCE,MULTIPLE_INHERITANCE_1 {

	@Override
	public void MOVIE() {
System.out.println("VEERAM");		
	}
	@Override
	public void NOTE() {
System.out.println("TNPL");		
	}
	@Override
	public void MOBILE() {
System.out.println("POCO");		
	}
	@Override
	public void FAN() {
System.out.println("USHA");		
	}
	@Override
	public void MIXE() {
System.out.println("PREETHI");		
	}
	@Override
	public void LIGHT() {
System.out.println("PHILIPS");		
	}
	public static void main(String[] args) {
		FINAL_INHERTIANCE obj = new FINAL_INHERTIANCE();
		obj.MOVIE();
		obj.NOTE();
		obj.MOBILE();
		obj.FAN();
		obj.MIXE();
		obj.LIGHT();
		
	}

}
