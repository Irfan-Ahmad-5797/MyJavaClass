package com.java.LogicalPrograms;

public class EvenAndOdd 
{
	public static void evennumber (int a,int b)
	{
		for(int i=10;i<=15;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void oddnumber (int a,int b)
	{
		for(int i=10;i<=15;i++)
		{
			if (i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int a=10;
		int b=15;
		System.out.println("even number is");
		evennumber(a, b);
		System.out.println("odd number is");
		oddnumber(a, b);
	}
}
/*
 * 1. On user defined range (parameterized method) print all even numbers. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	*/