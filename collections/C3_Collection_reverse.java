package com.evergent.corejava.collections;

import java.util.*;
public class C3_Collection_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
	    num.add(40);
	    num.add(50);
	    System.out.println("Before Reversing");
	    System.out.println(num);
	    Collections.reverse(num);
	    System.out.println("After Reversing");
	    System.out.println(num);
	    
	   
	

	}

}
