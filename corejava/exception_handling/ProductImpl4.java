package com.evergent.corejava.exception_handling;
class AgeNotFoundException extends Exception
{
	public AgeNotFoundException(String str)
	{
		System.out.println("Not Eligible to vote");
	}
}
public class ProductImpl4 {
	int age=16;
	public void myData() throws AgeNotFoundException
	{
		if(age<18)
		{
			throw new AgeNotFoundException("Age is Not valid");
		}
		else
		{
			System.out.println("Eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ProductImpl4 p1=new ProductImpl4();
			p1.myData();
		}
		catch(Exception e)
		{
			System.out.println("I can Handle");
		}
		
		

	}

}
