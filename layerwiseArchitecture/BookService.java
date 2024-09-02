package com.evergent.corejava.layerwiseArchitecture;

public class BookService {
	public int addBook(int bookId,String bookname,int price)
	{
		String grade="";
		if(price<=300)
		{
			grade="A";
		}
		else if(price<=600 && price>=300)
		{
			grade="B";
		}
		else
		{
			grade="C";
		}
		BookBean b1=new BookBean();
		b1.setBookId(bookId);
		b1.setBookName(bookname);
		b1.setGrade(grade);
		b1.setPrice(price);
		BookDAO bd=new BookDAO();
		bd.addBook(b1);
		
		return 1;
		
	}

}
