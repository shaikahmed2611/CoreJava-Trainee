package com.evergent.corejava.serialization;

import java.io.*;
public class Product1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fs=new FileOutputStream("C://Mydata/MyFile.txt");
			ObjectOutputStream obj=new ObjectOutputStream(fs);
			product p1=new product(123,"Shaik");
			product p2=new product(124,"Ahmed");
			obj.writeObject(p1);
			obj.writeObject(p2);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
