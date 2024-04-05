package firstprogram;

import java.util.Scanner;
import java.util.Scanner;

public class personexe {
public static void main(String[] args)  {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter person name");
	String n=sc.nextLine();
	System.out.println("enter the income");
	int i=sc.nextInt();
	
	//object creation
	person p1=new person();
	p1.setName(n);
	p1.setIncome(i);
	
	Taxcalucation c=new Taxcal();
	
	c.caluculatetax(p1);
	
	
	
}
}