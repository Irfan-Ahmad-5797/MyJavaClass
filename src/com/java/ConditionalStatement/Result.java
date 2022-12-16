package com.java.ConditionalStatement;

public class Result {
	public static void main(String[] args) {
		int obtainmarks=62;
		int passingmarks=40;
		if(obtainmarks>=80)
		{
			System.out.println("first class");
		}
		else if(obtainmarks>=60)
		{
			System.out.println("second class");
		}
		else if(obtainmarks>=40)
		{
			System.out.println("pass");
		}
		else 
		{ 
			System.out.println("candidate is fail");
		}
	}

}
