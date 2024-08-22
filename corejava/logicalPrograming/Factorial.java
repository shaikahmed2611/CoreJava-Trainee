package com.evergent.corejava.logicalPrograming;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number");
		int n1=scr.nextInt();
		int fact=1;
		for(int i=1;i<=n1;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact+" is the factorial of "+n1);

	}

}
