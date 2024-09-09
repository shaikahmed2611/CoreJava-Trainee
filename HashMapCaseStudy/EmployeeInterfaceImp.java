package com.evergent.corejava.HashMapCaseStudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class EmployeeInterfaceImp implements EmployeeInterface
{
	
	HashMap<Integer,ArrayList<EmployeeBean>>hmp=null;
	EmployeeInterfaceImp()
	{
		hmp=new HashMap<Integer,ArrayList<EmployeeBean>>();
	}

	@Override
	public void addEmployee(EmployeeBean eb) {
		// TODO Auto-generated method stub
		ArrayList<EmployeeBean> arr1=new ArrayList<>();
		arr1.add(eb);
		hmp.put(eb.getId(), arr1);
		System.out.println("Data Inserted successfully");
		
	}

	@Override
	public void retrieveData(int id) {
		// TODO Auto-generated method stub
		if(hmp.containsKey(id))
		{
           ArrayList<EmployeeBean> al=hmp.get(id);
           for(EmployeeBean req1:al)
			{
				System.out.println("Employee Name : "+req1.getName());
				System.out.println("Employee Department : "+req1.getDepartment());
			}
		}
		else
		{
			System.out.println("Key is not available");
		}
		
		
	}

	@Override
	public void updateData(int id,String new_name) {
		// TODO Auto-generated method stub
		if(hmp.containsKey(id))
		{
			 ArrayList<EmployeeBean> al=hmp.get(id);
			 for(EmployeeBean req1:al)
				{
					req1.setName(new_name);
				}
		}
		else
		{
			System.out.println("Key is not Available");
		}
		
	}

	@Override
	public void removeData(int id) {
		// TODO Auto-generated method stub
		if(hmp.containsKey(id))
		{
			hmp.remove(id);
		}
		else
		{
			System.out.println("Key is not available");
		}
		
	}

	@Override
	public void ListData() {
		// TODO Auto-generated method stub
		if(hmp.size()>0 && hmp!=null)
		{
		for(Map.Entry<Integer,ArrayList<EmployeeBean>> entry1:hmp.entrySet())
		{
			System.out.println("Employee Id : "+entry1.getKey());
			ArrayList<EmployeeBean> res=entry1.getValue();
			for(EmployeeBean req1:res)
			{
				System.out.println("Employee Name : "+req1.getName());
				System.out.println("Employee Department : "+req1.getDepartment());
			}
			
		}
		}
		else
		{
			System.out.println("No Data is Available");
		}
		
	}

}
