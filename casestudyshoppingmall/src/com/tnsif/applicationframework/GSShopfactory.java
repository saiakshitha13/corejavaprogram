package com.tnsif.applicationframework;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.Primeacc;
import com.tnsif.framework.shopfactory;

public class GSShopfactory implements shopfactory {

	@Override
	public Primeacc getNewPrimeaccount(int accNo, String accNm, float charges, boolean isprime) {
		Primeacc Primeacc=new GSPrimeAcc(accNo,accNm,charges,isprime);
		return Primeacc;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accNo, String accNm, float chargers, float deliverycharges) {
		NormalAcc normalacc=new GSNormalAcc(accNo,accNm,chargers,deliverycharges);
		
	return normalacc;
	}

}
