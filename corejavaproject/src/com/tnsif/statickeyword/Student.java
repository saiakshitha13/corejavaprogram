package com.tnsif.statickeyword;
//static method
public class Student {
int rollno;
String name="akki";

static String college="TKR";
   //static method
static void change()  {
	
}
Student (int r,String n) {
	rollno=r;
	name=n;
}
void display1() {
	System.out.println(rollno+""+name+""+college);
}

}
