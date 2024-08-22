package com.evergent.corejava.exception_handling;

public class ExceptionDemo3 {
  String name="null";
  int k=2;
   public void myData()
   {
	   try
		{
			System.out.println("one");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t);
			System.out.println("End");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("I can Handle"+e);
		}
	   catch(ArithmeticException e)
	   {
		   System.out.println("I can handle Exception "+e);
	   }
	  
   }
	public static void main(String[] args) {
		
		//All Exception are executed while abnormal Condition
		// Normal flow it wont execute any exception
		ExceptionDemo3 ed=new ExceptionDemo3();
		ed.myData();
		
		
		

	}

}
