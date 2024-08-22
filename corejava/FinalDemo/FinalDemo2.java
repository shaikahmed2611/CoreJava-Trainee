package com.evergent.corejava.FinalDemo;
class MyClass
{
	//final
	public void myProduct()
	{
		System.out.println("All Product ");
	}
}

public class FinalDemo2 extends MyClass
{
	final String cname="India";
public void myProduct()   //Cannot override the final method from MyClass
{
		System.out.println("Hello Product");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo2 fd=new FinalDemo2();
		fd.myProduct();

	}

}
