package com.evergent.corejava.collection;

import java.util.*;
public class CF11_HashSet_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("Hello");
		hs.add("Hii");
		System.out.println("welcome");
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
