package com.evergent.corejava.abstractDemo;

public class ProductImpl2 extends Product2 {
	//The type ProductImpl must implement the inherited abstract method Product.newProduct()
	
	public void newProduct()
	{
		System.out.println("This is new Product");
	}
	public void show()
	{
		System.out.println("This is local method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product2 p1=new ProductImpl2(); // reference we can can acess only abstract class
		p1.newProduct();
		p1.allProduct2();
		
		
	}

}
