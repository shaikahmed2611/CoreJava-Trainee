package com.evergent.corejava.constructor;

public class CopyConstructor {
	String name;
	int age;
	public CopyConstructor(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public CopyConstructor(CopyConstructor cp)
	{
		this.name=cp.name;
		this.age=cp.age;
	}
	public void displayDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		CopyConstructor c1=new CopyConstructor("ahmed",22);
		CopyConstructor c2=new CopyConstructor("shaik",23);
		c1.displayDetails();
		c2.displayDetails();
		

	}

}
