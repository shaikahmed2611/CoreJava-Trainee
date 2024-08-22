package com.evergent.corejava.constructor;
class Employee
{
	int eno;
	Employee()
	{
		
	}
	Employee(int eno)
	{
		this.eno=eno;
		System.out.println("Super class : "+eno);
	}
}
public class Employee6 extends Employee
{
  
  String ename;
  double sal;
  Employee6(int eno,String ename,double sal)
  {
	  super(eno);
	  this.ename=ename;
	  this.sal=sal;
  }
  public void display()
  {
	  System.out.println(ename+" "+sal);
  }
  public static void main(String[] args)
  {
	  Employee6 emp=new Employee6(123,"ahmed",345900.00);
	  emp.display();
	  
  }
	

}
