package com.evergent.corejava.abstractDemo;

public class ProductImpl3 extends Product2 {
	//The type ProductImpl must implement the inherited abstract method Product.newProduct()
	ProductImpl3()
	{
		System.out.println("Product Implementation : constructor");
	}
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
		ProductImpl3 p1=new ProductImpl3();
		p1.newProduct();
		p1.allProduct2();
		
		
	}

}
