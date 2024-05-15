package com.tnsif.applicationframework;

import com.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliverycharges) {
		super(accNo, accNm, charges, deliverycharges);
		// TODO Auto-generated constructor stub
	}
	

public void	bookproduct(float chargers)  {

System.out.println("Dear normal account user,your product chargers are :"+getCharges()+"delivery charges"+getDeliverycharges());
}
}



