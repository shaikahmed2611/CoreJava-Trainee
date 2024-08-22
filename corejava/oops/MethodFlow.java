package com.evergent.corejava.oops;

public class MethodFlow {
	public void show()
	{
		System.out.println("No parameter with no return type");
	}
	public void myData(int a,int b)
	{
		System.out.println(a+b);
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int myChange() {
		return 200;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodFlow mf=new MethodFlow();
		mf.show();
		mf.myData(10, 20);
	int k=mf.mul(20, 30);
	System.out.println(k);
	int res=mf.myChange();
	System.out.println(res);
	}

}
