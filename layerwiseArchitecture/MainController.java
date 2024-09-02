package com.evergent.corejava.layerwiseArchitecture;

import java.util.*;
public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bookId=0;
		String bookname="";
		int price=0;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the book Id");
		bookId=scr.nextInt();
		System.out.println("Enter the book Name");
		bookname=scr.next();
		System.out.println("Enter the book Price");
		price=scr.nextInt();
		BookService bs=new BookService();
    	int k1=bs.addBook(bookId, bookname, price);
	
		System.out.println("Inserted The Book sucessfully");
		
		

	}

}
