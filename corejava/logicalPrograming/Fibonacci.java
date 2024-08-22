package com.evergent.corejava.logicalPrograming;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number");
		int n1=scr.nextInt();
		int a=0,b=1;
		if(n1==1)
		{
			System.out.println(a);
		}
		else if(n1==2)
		{
			System.out.print(a+" "+b);
		}
		else
		{
			System.out.print(a+" "+b+" ");
			for(int i=0;i<n1-2;i++)
			{
				int c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}

	}

}
