package com.evergent.corejava.exception_handling;

public class OutOfMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Integer arr[]=new Integer[1000000000*10000000];
		System.out.println(arr);
		}
		catch(Exception e)
		{
		 System.out.print(e);
		}

	}

}
