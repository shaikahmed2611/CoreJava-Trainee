package com.evergent.corejava.layerwiseArchitectureBook_DB;

import java.util.*;
public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bookId=0;
		String bookname="";
		int price=0;
		Scanner scr=new Scanner(System.in);
		BookService bs=new BookService();
		while(true)
		{
			
			System.out.println("1.Insert  New Record");
			System.out.println("2.View All Records");
			System.out.println("3.Delete");
			System.out.println("Enter your choice :");
			int ch=scr.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Book BooId");
				bookId = scr.nextInt();
				System.out.println("Enter Book Titile");
				bookname = scr.next();	
				System.out.println("Enter Book price");
				price = scr.nextInt();
				int k1=bs.addBook(bookId, bookname, price);
				System.out.println("Inserted "+k1+" record successfully");
				break;
			case 2:
				 try
				 {
					 ArrayList r1=bs.getBookDetailId();
					Iterator it=r1.iterator();
					  while(it.hasNext())
					  {
						  System.out.println(it.next());
					  }
					 
				 }
				 catch(Exception e)
				 {
					 e.printStackTrace();
				 }
				 break;
			case 3:
				
				 try
				 {
					 System.out.println("Enter Book BooId");
						bookId = scr.nextInt();
					int res123=bs.deleterow(bookId);
					System.out.println("Deleted recorded suceessfully");
				 }
				 catch(Exception e)
				 {
					 e.printStackTrace();
				 }
				 break;
			case 4:
				   System.out.println("Conncetion disclosed successfully");
				   System.exit(0);

	}
		}
	}

}
