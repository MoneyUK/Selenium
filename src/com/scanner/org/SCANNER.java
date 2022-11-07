package com.scanner.org;

import java.util.Scanner;

public class SCANNER {
	public static void main(String[] args) {
		
	Scanner u =new Scanner(System.in);
	
	System.out.println("ENTER YOUR NAME");
	String nextline =u.nextLine();
	System.out.println(nextline);
		
	System.out.println("ENTER YOUR AGE");
	char charat = u.next().charAt(0);
	
	System.out.println("ENTER YOUR DOB");
	int  nextInt = u.nextInt();
	System.out.println(nextInt);
	
	System.out.println("Enter Your Percentage");
	float nextfloat =u.nextFloat();
	System.out.println(nextfloat);
	
	System.out.println("ENTER YOUR FRIEND NAME");
	String next = u.next();
	System.out.println(next);
			
	
	}

}
