package com.evergent.corejava.oops;
class MyPerson
{
	public void person_info()
	{
		System.out.println("Ahmed");
	}
}
class PersonDetail extends MyPerson
{
	public void personData()
	{
		System.out.println("Hyderabad");
	}
}

public class Multilevel  extends PersonDetail{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel mil=new Multilevel();
		mil.personData();
		mil.person_info();
		
		
		

	}

}
