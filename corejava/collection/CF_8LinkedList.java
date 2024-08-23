package com.evergent.corejava.collection;

import java.util.*;
public class CF_8LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList fruit=new LinkedList();
		fruit.add("apple");
		fruit.add("Banana");
		fruit.add("cherry");
		fruit.add("papaya");
		System.out.println("Initial Linked List : "+fruit);
		fruit.addFirst("Mango");
		System.out.println("Linked list after adding at index first "+fruit);
		fruit.addLast("Orange");
		System.out.println("Linked List after adding element at last index "+fruit);
		System.out.println("Element st index 2:"+fruit.get(2));
		fruit.removeFirst();
		System.out.println("After removing first element : "+fruit);
		fruit.removeLast();
		System.out.println("After removing last element : "+fruit);
		boolean res=fruit.contains("Banana");
		System.out.println("contains banana "+res);
		fruit.remove("Banana");
		System.out.println("After removing banana : "+fruit);
		System.out.println("Fruit Size : "+fruit.size());
		fruit.clear();
		System.out.println("After clearing "+fruit);
		
		
		
		
		

	}

}
