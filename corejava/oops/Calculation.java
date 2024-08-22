package com.evergent.corejava.oops;
// encapsulation example
public class Calculation {
	int a=10;  // attributes
	int b=20;
	int c;
	public void addition() // methods 
	{
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) // main method
	{
	Calculation c1=new Calculation();       // object creation of class
	c1.addition();   // acessing the method by refernce 
	
	}
}

