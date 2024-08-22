package com.evergent.corejava.basicprogram;
import java.util.*;
public class BigOfFiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int n1=scr.nextInt();
		int n2=scr.nextInt();
		int n3=scr.nextInt();
		int n4=scr.nextInt();
		int n5=scr.nextInt();
		if(n1>=n2 && n1>=n3&& n1>=n4 && n1>=n5)
		{
			System.out.println(n1+" is a greater number");
		}
		else if(n2>=n1 && n2>=n3 && n2>=n4 && n2>=n5)
		{
			System.out.println(n2+" is a greater number");
		}
		else if(n3>=n1 && n3>=n2 && n3>=n4 && n3>=n5)
		{
			System.out.println(n3+" is a greater number");
		}
		else if(n4>=n1 && n4>=n2 && n4>=n3 && n4>=n5)
		{
			System.out.println(n4+" is a greater number");
		}
		else
		{
			System.out.println(n5+" is a greater number");
		}

	}

}
