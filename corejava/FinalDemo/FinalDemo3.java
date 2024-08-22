package com.evergent.corejava.FinalDemo;
 //final 
class MyClass1
{
	public void myProduct()
	{
		System.out.println("All Product");
	}
}

public class FinalDemo3 extends MyClass //The type FinalDemo3 cannot subclass the final class Myclass
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass1 cs=new MyClass1();
		cs.myProduct();

	}

}
