package com.tnsif.mainmethod;

import com.tnsif.applicationframework.GSNormalAcc;
import com.tnsif.applicationframework.GSPrimeAcc;
import com.tnsif.applicationframework.GSShopfactory;

public class Client {
	 public static void main(String[] args) {
		 GSShopfactory obj=new GSShopfactory();
	//prime account creation	 
		 
		 GSPrimeAcc ga=(GSPrimeAcc)obj.getNewPrimeaccount(12,"akki",500.6f, true);
		 ga.bookproduct(ga.getCharges());
		 
		 //normal acc creation
		 
		 GSNormalAcc nr=(GSNormalAcc)obj.getNewNormalAcc(13,"chanti",500.6f,65.4f);
		 nr.bookproduct(nr.getCharges());
	 }

	 
}
