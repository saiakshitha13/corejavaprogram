package com.tnsif.overloading;

public class Overloadingdemo {
	public static void main(String[] args)  {
		
		point p1=new point();
		point p2=new point(2.3f);
		point p3=new point(6.7f,8.0f);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		
	}

}
