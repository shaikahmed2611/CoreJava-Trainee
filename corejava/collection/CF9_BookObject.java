package com.evergent.corejava.collection;
import java.util.*;
class Book5
{
	String name;
	public Book5(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return name;
	}
	
}

public class CF9_BookObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book5 b1=new Book5("Core Java");
		Book5 b2=new Book5("Let Us C");
		Book5 b3=new Book5("Java Index Book");
		Book5 b4=new Book5("Java Interview Books");
		ArrayList<Book5> bk=new ArrayList<Book5>();
		bk.add(b1);
		bk.add(b2);
		bk.add(b3);
		bk.add(b4);
		System.out.println(bk);
		

	}

}
