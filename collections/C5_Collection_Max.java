package com.evergent.corejava.collections;

import java.util.*;
public class C5_Collection_Max {

	public static void main(String[] args) {
		
		/*
		 *Collections.shuffle()
		This method randomly shuffles the elements in the specified list.
		 */
		List<Integer> num=new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
	    num.add(40);
	    num.add(50);
	    System.out.println("Maximum Element"+ Collections.max(num));
	
	    
	    System.out.println("Minimum Element"+Collections.min(num));
	  
	    
	   
	

	}

}
