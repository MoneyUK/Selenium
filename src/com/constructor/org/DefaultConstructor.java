package com.constructor.org;

public class DefaultConstructor {
	
	int a;
	String k;
	DefaultConstructor(){
		a=24;
		k="KILLER";
	}
	public static void main(String[] args) {
		DefaultConstructor obj =new DefaultConstructor();
		System.out.println(obj.a);
		System.out.println(obj.k);
		
	}

}
