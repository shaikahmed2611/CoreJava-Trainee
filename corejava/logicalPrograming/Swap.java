package com.evergent.corejava.logicalPrograming;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number 1");
		int a=scr.nextInt();
		System.out.println("enter the number 2");
		int b=scr.nextInt();
		int temp1=a;
		a=b;
		b=temp1;
		System.out.print("After Swaping the value "+a+" "+b);
		

	}

}
