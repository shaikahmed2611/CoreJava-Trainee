package com.evergent.corejava.exception_handling;

public class StackOverFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			recursivemethod();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static void recursivemethod()
	{
		recursivemethod();
	}

}
