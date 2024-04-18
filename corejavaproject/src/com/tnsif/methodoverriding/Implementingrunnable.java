package com.tnsif.methodoverriding;

public class Implementingrunnable implements Runnable {
	//Override
	public void run()  {
		System.out.println("implementing runnable interface");
	}
  public static void  main(String[] args)  {
	   Implementingrunnable r=new Implementingrunnable();
	  
	   Thread t1=new Thread(r);
	   t1.start();
			   }

}