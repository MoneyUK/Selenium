package com.constructor.org;

public class ParameterizedConstructor {
	
			String Name;
			int age;
			String Bloodgroup;
			int Phone;
			
	ParameterizedConstructor(String a,int b,String c,int d){
	
			Name=a;
			age =b;
			Bloodgroup=c;
			Phone=d;
	}
	public static void main(String[] args) {
ParameterizedConstructor obj = new ParameterizedConstructor("KILLER",24,"B+VE",88996);
	System.out.println(obj.Name);
	System.out.println(obj.age);
	System.out.println(obj.Bloodgroup);
	System.out.println(obj.Phone);
	
		}
}
