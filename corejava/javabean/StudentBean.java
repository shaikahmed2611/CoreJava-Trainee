package com.evergent.corejava.javabean;

public class StudentBean {
	private int sno;
	private String sname;
	private String address;
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentBean [sno=" + sno + ", sname=" + sname + ", address=" + address + "]";
	}
	


}
