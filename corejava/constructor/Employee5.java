package com.evergent.corejava.constructor;

public class Employee5 {
	int eno;
	String name;
	double sal;
	Employee5(int eno)
	{
		System.out.println("Default constructor");
		System.out.println("employee number: "+eno);
	}
	Employee5(int eno, String name,double sal)
	{
		this(eno);
		this.name=name;
		this.sal=sal;
	}
	public void display()
	{
		System.out.println("employee name : "+name);
		System.out.println("employee sal : "+sal);
	}
	
	
	public static void main(String[] args) {
		Employee5 emp5=new Employee5(123,"ahmed",12500);
		emp5.display();
		
		
	}

}
