package com.tnsif.applicationframework;

import com.tnsif.framework.Primeacc;

public class GSPrimeAcc extends Primeacc {

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		super(accNo, accNm, charges, isprime);
		// TODO Auto-generated constructor stub
	}
	 public void bookproduct(float chargers ) {
		 System.out.println("Dear Prime user, your product charges are :"+ getCharges());
		 
	 }
	@Override
	public String toString() {
		return "GSPrimeAcc [isIsprime()=" + isIsprime() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	 
	 

}