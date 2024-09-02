package com.evergent.corejava.collections;

import java.util.*;
public class C1_Collection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(3);
	    num.add(13);
	    num.add(5);
	    System.out.println("Before Sorting");
	    Collections.sort(num);
	    System.out.println("After Sorting");
	    System.out.println(num);
	

	}

}
