package com.evergent.corejava.java8Lambda;

import java.util.*;

public class LambdaProg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>mylist=Arrays.asList(1,2,3,4,5,6);
		System.out.println(mylist);
		for(Integer i:mylist)
		{
			System.out.println(i);
		}
		mylist.forEach(System.out::println);
		
	}

}
