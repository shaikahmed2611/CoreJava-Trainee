package com.evergent.corejava.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class CF_10_ArrayList_Genric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		System.out.println(al);
		System.out.println("It is iterating in forward direction");
       ListIterator lt=  al.listIterator();
       while(lt.hasNext())
       {
    	   System.out.println(lt.next());
       }
       System.out.println("It is iterating at backward Direction");
       while(lt.hasPrevious())
       {
    	   System.out.println(lt.previous());
       }
       
	}

}
