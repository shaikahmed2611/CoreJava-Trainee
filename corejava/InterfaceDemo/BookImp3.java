package com.evergent.corejava.InterfaceDemo;
// implementing the multiple in heritance using interface
public class BookImp3 implements MyData,interfaceBook // implement two class
{
	public void bookTitle() // interface method implemented
	{
		System.out.println("Python");
	}
	public void bookAuthor()  //interface method implemented
	{
		System.out.println("James");
		
	}
	public void bookPrice()   //interface method implemented
	{
		System.out.println("345");
	}
	public void mydata()      //interface method implemented
	{
		System.out.println("this is my data");
	}
	public void mydatainfo1()
	{
		System.out.println("hello world");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BookImp3 b3=new BookImp3(); // object creation of class
		b3.bookAuthor();
		b3.bookPrice();
		b3.bookTitle();
		b3.mydata();
		System.out.println(b3.a);
		
		

	}

}
