package com.evergent.corejava.exception_handling;

public class ExceptionDemo6 {
	 String name="nullA";
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
			   System.out.println("I can"+e); }
		   finally
		   {
			   System.out.println("Finally Block for disclose");
		   }
		  
		  
	   }
		public static void main(String[] args) {
			
			
			ExceptionDemo6 ed=new ExceptionDemo6();
			ed.myData();
			
			
			

		}
	   

}
