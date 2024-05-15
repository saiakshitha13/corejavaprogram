package tnsif.Streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Consumer;


public class ConsumerDemo {
	public static void main(String[] args) {
		List<String> cities=new ArrrayList<String>();
		cities.add("delhi");
		cities.add("mumbai");
		cities.add("goa");
		
		Consumer<String> print=city->(cities);
		
		
	}

}
