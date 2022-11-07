package com.abstracts.org;

public class INTERFACE_1 implements INTERFACE {

	@Override
	public void BGMI() {
System.out.println("BATTLE GROUND MOBILE INDIA");		
	}
	@Override
	public void CHARACTER() {
		System.out.println("VECTOR");		
	}
	@Override
	public void WEAPONS() {
		System.out.println("M416");
			}
	@Override
	public void VECHILE() {
		System.out.println("BOAT");		
	}
	public static void main(String[] args) {
		INTERFACE_1 obj =new INTERFACE_1();
		obj.BGMI();
		obj.CHARACTER();
		obj.VECHILE();
		obj.WEAPONS();
	}

}
