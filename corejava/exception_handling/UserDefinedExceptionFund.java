package com.evergent.corejava.exception_handling;
class InsufficientFund extends Exception
{
	InsufficientFund(String msg)
	{
		super(msg);
	}
}

public class UserDefinedExceptionFund {
	public static void show(double amount) throws InsufficientFund
	{
		double balance=500.00;
		if(amount>balance)
		{
			throw new InsufficientFund("NO sufficient balance");
		}
		else
		{
			System.out.println("Successfull withdrawal");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			show(700.00);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
