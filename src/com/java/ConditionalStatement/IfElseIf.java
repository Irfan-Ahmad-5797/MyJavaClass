package com.java.ConditionalStatement;

public class IfElseIf 
{
	public static void main(String[] args) 
	{
		int obtainmark=70;
		if (obtainmark>100 || obtainmark<0)
		{
			System.out.println("Invalid Marks");
		}
		else if (obtainmark>=70)
		{
			System.out.println("Distinction");
		}
		else if (obtainmark>=60)
		{
			System.out.println("First Class");
		}
		else if (obtainmark>=50)
		{
			System.out.println("Second Class");
		}
		else if (obtainmark>=40)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		}

}
