package com.evergent.corejava.exception_handling;
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}

public class  UserdefinedException
{
	
	public static void checkAge(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age is lesser than 18 so u are eligible to vote");
		}
		else
		{
			System.out.println("Aceess Guranted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		   checkAge(12);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("This is message "+e.getMessage());
		}

	}

}
