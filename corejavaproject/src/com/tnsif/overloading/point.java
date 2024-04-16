package com.tnsif.overloading;

public class point {
	private float x;
	private float y;
	
	public point() {
		x=6.7f;
		y=9.7f;
}
public point(float x) {
	this.x=x;
	this.y=x;
}
public point (float x,float y) {
	this.x=x;
	this.y=y;
}
public point (float x,float y);
}
	

}
