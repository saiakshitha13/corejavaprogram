package com.tnsif.framework;

public abstract class Primeacc extends Shopacc {
	
	private boolean isprime;
	private static final float deliverycharges=0;
	public boolean isIsprime() {
		return isprime;
	}
	//getters and settters
	public void setIsprime(boolean isprime) {
		this.isprime = isprime;
	}
	public static float getDeliverycharges() {
		return deliverycharges;
	}
	@Override
	public String toString() {
		return "Primeacc [isprime=" + isprime + ", isIsprime()=" + isIsprime() + "]";
	}//tostring
	public Primeacc(int accNo, String accNm, float charges, boolean isprime) {
		super(accNo, accNm, charges);
		this.isprime = isprime;
	}
	
     public void bookproduct (float charges)  {

}
}
