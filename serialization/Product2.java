package com.evergent.corejava.serialization;

import java.io.*;
public class Product2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fi=new FileInputStream("C://Mydata/MyFile.txt");
			ObjectInputStream obj=new ObjectInputStream(fi);
			product p1;
			while((p1=(product)obj.readObject())!=null)
			{
				System.out.println("Object Detail"+p1.getId()+p1.getName());
			}
			
			
			
		}
		catch(Exception e)
		{
			if(e.getMessage()==null)
			{
				System.exit(0);
			}
		}
	}

}
