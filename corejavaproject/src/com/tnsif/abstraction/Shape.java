package com.tnsif.abstraction;

public abstract class Shape {

	  protected float area;
	  
	  //abstract method
	  abstract void calarea();
	  
	  //concreate method
	  void show()	{
		  System.out.println("area of shape"+area);
	  }
}
