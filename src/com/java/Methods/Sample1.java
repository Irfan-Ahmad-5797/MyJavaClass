package com.java.Methods;

import com.java.Methods2.Sample3;

public class Sample1 
{
	public static void addition()
	{
		int a=10;
		int b=20;
		int add=a+b;
		System.out.println(add);
	}
	public static void main(String[] args) 	//to run the program
	{
		addition();
		Sample2.subtraction();//same package diff.class
		Sample3.result();//diff.package diff.class
	}

}
