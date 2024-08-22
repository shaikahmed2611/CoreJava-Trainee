package com.evergent.corejava.ahmed.application3;

public class EmployeeInfo  extends AccountDetails implements Employee_Interface{
	int empno;
	double sal;
	String address;
	public void employee_info(int empno,double sal)
	{
		this.empno=empno;
		this.sal=sal;
	}
	public void employee_address(String add)
	{
		this.address=add;
	}
	public void employee_details()
	{
		System.out.println("Empoyee number :"+empno);
		System.out.println("Employee Slaray : "+sal);
		System.out.println("Employee Address : "+address);
	}
	public void accountDetails()
	{
		System.out.println("My Account details "+1234567);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interface calling method
		EmployeeInfo emp=new EmployeeInfo();
		emp.employee_info(101,209988.6);
		emp.employee_address("Hyderabad");
		emp.employee_details();
		// Implementing abstract class
		emp.accountDetails();
		//Bank Info
		BankRbi rb=new BankRbi(5.9,6.8);
		rb.getBankDetails();
		
		
		
		

	}
	

}
