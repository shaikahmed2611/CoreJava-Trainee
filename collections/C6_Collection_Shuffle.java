package com.evergent.corejava.collections;

import java.util.*;
public class C6_Collection_Shuffle {

	public static void main(String[] args) {
		
		/*
		 *Collections.fill()
		This method replaces all elements of the specified list with the specified element.
		Filling a List with a Specific Value
		 */
		List<Integer> num=new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
	    num.add(40);
	    num.add(50);
	    System.out.println("Before Filling of element");
	    System.out.println(num);
	    Collections.fill(num,5);
	    System.out.println("After Filling of element");
	    System.out.println(num);
	    
	 
	  
	    
	   
	

	}

}
