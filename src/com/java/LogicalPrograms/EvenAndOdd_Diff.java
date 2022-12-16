package com.java.LogicalPrograms;
/*
 * Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6
*/
public class EvenAndOdd_Diff 
{
	public static int evenNum(int a,int b)
	{
		System.out.println("even number are");
		int evensum=0;
		for (int i=a;i<=b;i++)
		{
			
			if (i%2==0)
			{
				
				int sum =evensum+1;
				System.out.println(i);
			}
		}
		return evensum;
	}
	public static int oddNum (int a,int b)
	{			System.out.println("odd number are");
		int oddsum=0;
		for (int i=a;i<=b;i++)
		{

			if (i%2!=0)
			{
				int sum1=oddsum+1;
				System.out.println(i);
			}
		}
		return oddsum;
	}
	
	public static void main(String[] args) 
	{
		int a=3;
		int b=9;
		evenNum(a, b);
		oddNum(a, b);
	}

}
