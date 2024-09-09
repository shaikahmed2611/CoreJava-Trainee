package com.evergent.corejava.layerwiseArchitectureBook_DB;

import java.util.ArrayList;

public class BookService {
	public int addBook(int bookId,String bookname,int price)
	{
		String grade="";
		int res=0;
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
		try
		{
		res=bd.addBook(b1);
		return res;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
		
		
		
	}
	public ArrayList getBookDetailId() throws Exception
	{
		BookDAO bd=new BookDAO();
		
		ArrayList al=bd.getBookDetail();
		return al;
	}
	public int deleterow(int bookId) throws Exception
	{
		BookDAO bd=new BookDAO();
		int ch=bd.delRow(bookId);
		return ch;
	}

}
