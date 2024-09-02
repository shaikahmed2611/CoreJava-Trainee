package com.evergent.corejava.layerwiseArchitecture;

import java.util.*;
public class BookDAO {
	public int addBook(BookBean b1)
	{
		try
		{
			ArrayList al=new ArrayList<>();
			al.add(b1.getBookId());
			al.add(b1.getBookName());
			al.add(b1.getPrice());
		    al.add(b1.getGrade());
		    System.out.println(al);
		    System.out.println(b1.getBookId());
		    System.out.println(b1.getBookName());
		    System.out.println(b1.getPrice());
		    System.out.println(b1.getGrade());
		    
		    return 1;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 0;
		}
	}

}
