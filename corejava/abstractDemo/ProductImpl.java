package com.evergent.corejava.abstractDemo;

public class ProductImpl extends Product {
	//The type ProductImpl must implement the inherited abstract method Product.newProduct()
	public void show()
	{
		System.out.println("This is local show method");
	}
	public void newProduct()          // implementing the abstract method of abstract class of Product
	{
		System.out.println("This is new Product");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductImpl p1=new ProductImpl();
		p1.show();
		p1.newProduct();
		p1.allProduct();
		Product p2=new ProductImpl(); // reference of parent class
		p2.newProduct();
		p2.allProduct();
		
	}

}
