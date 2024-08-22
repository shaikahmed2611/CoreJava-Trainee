package com.evergent.corejava.InterfaceDemo;
// if we want only interface method but not the local method so we use the reference to the interface
public class BooksImp2  implements interfaceBook{
	public void bookTitle() {
		System.out.println("Core java");
	}
	public void bookAuthor()
	{
		System.out.println("oracle corp");
	}
	public void bookPrice() {
		System.out.println("1550");
		
	}
	public void show()
	{
		System.out.println("Myshow");
	}
	public void mydatainfo1()
	{
		System.out.println("hello world");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceBook b1=new BooksImp2(); // creating reference of the interface
		b1.bookAuthor();
		b1.bookPrice();
		b1.bookTitle();

	}

}
