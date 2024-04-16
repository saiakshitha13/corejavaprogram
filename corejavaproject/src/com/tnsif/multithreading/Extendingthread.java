package com.tnsif.multithreading;

public class Extendingthread extends Thread {
	public void run()  {
		System.out.println("hello world");   //running state
	}
   public static void main(String[] args)  {
	   Extendingthread v=new Extendingthread();  //new stage
	   v.start();  //runnable state
   }
}
