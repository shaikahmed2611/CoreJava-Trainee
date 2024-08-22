package com.evergent.corejava.logicalPrograming;

import java.util.Scanner;

public class PatternPrograming3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number");
		int n1=scr.nextInt();
		for(int i=1;i<=n1;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
