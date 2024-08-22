package com.evergent.corejava.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(5);
		ts.add(6);
		System.out.println(ts);
	   Iterator it=ts.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
	
		

	}

}
