package com.evergent.corejava.collection;

import java.util.*;
public class CF6_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add("ramu");
		l.add("ravi");
		l.add("hello");
	   ListIterator it=l.listIterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
	   while(it.hasPrevious())
	   {
		   System.out.println(it.previous());
	   }
	   
	   		

	}

}
