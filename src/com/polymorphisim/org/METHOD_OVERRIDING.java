package com.polymorphisim.org;

public class METHOD_OVERRIDING extends METHOD_OVERLOADING{
	@Override
	public void laptop() {
		super.laptop();
		System.out.println("BLUE" );
		System.out.println( );
	}
	
@Override
public void laptop1(int a) {
	super.laptop1(a);
	System.out.println("BLACK");
	System.out.println( );
	}
@Override
public void laptop2(int a, char b) {
	super.laptop2(a, b);
	System.out.println("WHITE");
	System.out.println( );
}
@Override
public void laptop3(String c) {
	super.laptop3(c);
	System.out.println("ORANGE");
	System.out.println( );
}
public static void main(String[] args) {
	METHOD_OVERRIDING obj =new METHOD_OVERRIDING();
	obj.laptop();
	obj.laptop1(3);
	obj.laptop2(4, 'k');
	obj.laptop3("ok");
	
}
}
