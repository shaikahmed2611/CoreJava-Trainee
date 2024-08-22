package com.evergent.corejava.exception_handling;
class ProductNotFoundException extends Exception
{
	public ProductNotFoundException(String msg)
	{
		System.out.println("hello" + msg);
	}
}
public class ProductImpl3 {
	int pno=105;
	public void myData() throws ProductNotFoundException
	{
		if(pno>100)
		{
			throw new ProductNotFoundException("This is Product");
		}
		else
		{
			System.out.println("Product is available ");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ProductImpl3 p1=new ProductImpl3();
			p1.myData();
		}
		catch(Exception e)
		{
			System.out.println("I can Handle "+e);
		}
		
		

	}

}
