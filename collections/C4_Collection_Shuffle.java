package com.evergent.corejava.collections;

import java.util.*;
public class C4_Collection_Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	    System.out.println("Before Shuffle");
	    System.out.println(num);
	    Collections.shuffle(num);
	    System.out.println("After Shuufle");
	    System.out.println(num);
	    
	   
	

	}

}
