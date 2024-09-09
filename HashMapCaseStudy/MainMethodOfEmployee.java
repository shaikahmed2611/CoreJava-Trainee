package com.evergent.corejava.HashMapCaseStudy;
import java.util.*;
public class MainMethodOfEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		EmployeeInterfaceImp emp=new EmployeeInterfaceImp();
		while(true)
		{
		
			System.out.println("======================");
			System.out.println(" Employee Management  System using HashMap");
			System.out.println("======================");
			System.out.println("1-addEmployee");
			System.out.println("2-retrieveData");
			System.out.println("3-updateData");
			System.out.println("4-removeData");
			System.out.println("5-ListData");
			System.out.println("Please Select one Option");
			int n1=scr.nextInt();
			switch(n1)
			{
			case 1: EmployeeBean b1=new EmployeeBean();
			        System.out.println("Enter the unique id : ");
			        int id=scr.nextInt();
			        b1.setId(id);
			        System.out.println("Enter the name: ");
			        String name=scr.next();
			        b1.setName(name);
			        System.out.println("Enter the Department :");
			        String department=scr.next();
			        b1.setDepartment(department);
			        emp.addEmployee(b1);
			        break;
			case 2: 
				    System.out.println("Enter the Id :");
				    int id1=scr.nextInt();
				    emp.retrieveData(id1);
				    break;
			case 3:
				    System.out.println("Enter the Id");
				    int id2=scr.nextInt();
				    System.out.println("Enter the Name to change");
				    String name12=scr.next();
				    emp.updateData(id2, name12);
				    System.out.println("Data Updated Succesfully");
				    break;
			case 4:
				System.out.println("Enter the Id");
			    int id3=scr.nextInt();
			    emp.removeData(id3);
			    System.out.println("Data removed succesfully");
			    break;
			case 5:
				System.out.println("Available Data");
				emp.ListData();
				break;
			        
			              
				
			}
		}
		

	}

}
