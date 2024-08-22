package com.evergent.corejava.collection;

import java.util.*;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList al=new ArrayList();
	al.add(100);
	al.add("Hello");
	al.add(45.6);
	al.add(null);
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
		

	}

}
