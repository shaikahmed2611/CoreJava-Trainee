package com.evergent.corejava.exception_handling;

public class ExceptionDemo4 {
  String name=null;
  int k=2;
   public void myData()
   {
	   // There are two exception in a class Developer handle in exception and then occur 2nd exception will be handle
	   
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
		ExceptionDemo4 ed=new ExceptionDemo4();
		ed.myData();
		
		
		

	}

}
