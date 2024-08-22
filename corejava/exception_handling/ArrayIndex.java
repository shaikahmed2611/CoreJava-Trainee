package com.evergent.corejava.exception_handling;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {1,2,3};
		try {
			System.out.println(numbers[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		

	}

}