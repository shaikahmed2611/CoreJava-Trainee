package com.evergent.corejava.javabean;

public class EmployeeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Store the value in the java Bean
		Employee emp=new Employee();
		emp.setEno(10);
		emp.setEname("Ahmed");
		emp.setSal(50000.9);
		//retrieve  value from Bean
		System.out.println("Employee Number : "+emp.getEno());
		System.out.println("Employee Name : "+emp.getEname());
		System.out.println("Employee salary : "+emp.getSal());
		

	}

}
