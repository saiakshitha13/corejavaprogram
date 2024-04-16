package com.tnsif.abstraction;
//child class
public class Square extends Shape {
	
	private float side;   //data member or variables
	
	public Square()  {
		side=2.0f;
	}
	@Override
	void calarea()  {
		super.area=side*side;
	}

}
