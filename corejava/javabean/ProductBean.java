package com.evergent.corejava.javabean;

import java.io.Serializable;

public class ProductBean implements Serializable {
	private int eno;
	private String pname;
	private double sal;
	ProductBean(int eno,String pname,double sal)
	{
		this.eno=eno;
		this.pname=pname;
		this.sal=sal;
	}
	public int getEno() {
		return eno;
	}
	
	public String getPname() {
		return pname;
	}
	
	public double getSal() {
		return sal;
	}
	
	

}
