package com.evergent.corejava.collections;

import java.util.*;
public class C2_Collection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> num=new ArrayList<>();
		num.add("apple");
		num.add("Banana");
		num.add("Ahmed");
	    num.add("Hyderabad");
	    num.add("Cat");
	    System.out.println("Before Sorting");
	    Collections.sort(num);
	    System.out.println("After Sorting");
	    System.out.println(num);
	

	}

}
