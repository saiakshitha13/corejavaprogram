package com.tnsif.framework;

public interface shopfactory {
public Primeacc	getNewPrimeaccount(int accNo,String accNm,float charges,boolean isprime);
public NormalAcc getNewNormalAcc( int accNo,String accNm,float chargers,float delivery);
	

}

