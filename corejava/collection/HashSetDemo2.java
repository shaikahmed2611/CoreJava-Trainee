package com.evergent.corejava.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(null);
		hs.add(10);
		hs.add("Hii");
		System.out.println(hs);
	  Iterator it=hs.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	
		

	}

}
