package com.controlstatments.org;

public class FIBONACI {
	public static void main(String[] args) {
		
	int  a= 2, b=3,c, count=12;
	 
	System.out.print(a+" " + b);

	 for (int i = 3; i <= count; i++) {
		 
		 c=a+b;
		 
System.out.print(" "+c);

					a=b;
					b=c;
		}
	}

}
