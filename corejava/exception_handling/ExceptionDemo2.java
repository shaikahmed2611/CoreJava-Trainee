package com.evergent.corejava.exception_handling;

public class ExceptionDemo2 {
  String name="null";
   public void myData()
   {
	   try
		{
			System.out.println("one");
			System.out.println(name.length());
			System.out.println("End");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("I can Handle"+e);
		}
   }
	public static void main(String[] args) {
		
		//All Exception are executed while abnormal Condition
		// Normal flow it wont execute any exception
		ExceptionDemo2 ed=new ExceptionDemo2();
		ed.myData();
		
		
		

	}

}
