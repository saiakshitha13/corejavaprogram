package tnsif.Streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamdemo {
public static void main(String[] args)  {
	List<Product> p1=new ArrayList<Product>();
	
	p1.add(new Product(1,"hp",250000f));
	p1.add(new Product(2,"dell",300000f));
	p1.add(new Product(3,"Lenova",290000f));
	
	List<Boolean>p2=p1.stream().filter(p->p.price>30000) //diltering data
			.map(p->p.price)
			.collect(Collectors.toList());//collecting as list
	  System.out.println(p2);
	  //using collectors method to sum the prices
	
	  double totalprice=p1.stream().collect(Collectors.summingDouble(Product->Product.price));
 System.out.println(totalprice);
 
 //to find maximum data
 Product a=p1.stream().max((product1,product2)->product1.price?1:-1) .get();
 System.out.println(a.price);
 
 
 
}
}
