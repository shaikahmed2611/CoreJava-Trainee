package com.evergent.corejava.exception_handling;
class InvalidException extends RuntimeException
{
	public InvalidException(String message)
	{
		super(message);
	}
}
public class UserDefinedUncheckedException 
{
	public static void validateScore(int score) throws InvalidException
	{
		int arr[]= {10,20,30};
		if(score>=3)
		{
			System.out.println("This is the message array index out of bound"+arr[score]);
			throw new InvalidException("Invalid size");		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validateScore(10);
			
		}
		catch(RuntimeException e)
		{
				System.out.println(e.getMessage());
//				e.printStackTrace();
		}
		

	}

}
