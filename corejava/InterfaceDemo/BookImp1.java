package com.evergent.corejava.InterfaceDemo;

public class BookImp1 implements interfaceBook // implementing bookinterface
{
	public void bookAuthor()            //interface method
	{
		System.out.println("Oracle");
	}
	public void bookTitle()                //interface method
	{
		System.out.println("Java");
	}
	public void bookPrice()                 //interface method
	{
		System.out.println("150");
	}
	public void mydatainfo1()
	{
		System.out.println("hello world");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookImp1 b1=new BookImp1(); // creating method to the class 
		b1.bookAuthor();      // access the interface method
		b1.bookPrice();
		b1.bookTitle();

	}

}
