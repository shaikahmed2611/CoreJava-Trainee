package com.evergent.corejava.collection;
import java.util.*;
public class CF7_Enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add("Hello");
		v.add(100);
		v.add(10.5);
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		

	}

}
