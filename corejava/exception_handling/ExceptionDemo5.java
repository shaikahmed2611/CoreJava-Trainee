package com.evergent.corejava.exception_handling;

public class ExceptionDemo5 {
	 String name=null;
	  int k=2;
	   public void myData()
	   {
		   // we should follow Exception Herirachy
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
		   catch(Exception e)
		   {
			   System.out.println("I can"+e);
		   }
		  
		  
	   }
		public static void main(String[] args) {
			
			
			ExceptionDemo4 ed=new ExceptionDemo4();
			ed.myData();
			
			
			

		}
	   

}
