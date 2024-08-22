package com.evergent.corejava.ahmed.application3;

public class BankRbi {
	static
	{
		System.out.print("Welcome to the RBI Bank");
	}
	public  BankRbi()
	{
		System.out.println("RBI Loan and personal role");
	}
	public BankRbi(double p,double r)
	{
		System.out.println(p*r/100);
	}
	public final void getBankDetails()
	{
		System.out.println("Home Loans interest is 8.5%");
		System.out.println("Personal Loans interest is 11%");
	}
	

}
