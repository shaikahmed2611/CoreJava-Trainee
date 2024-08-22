package com.evergent.corejava.toString_example;

public class ImmutableString {
	private String value;
	public ImmutableString(String value)
	{
		this.value=value;
	}
	public String toString()
	{
		return value;
	}

}
