package com.java.LogicalLoops;
//print number from 1 to 50 which are divisible by2 and 6
public class ForLoop3 
{
	public static void main(String[] args) 
    {
		int count=0;
		for (int i=1;i<=50;i++)
		{
			if (i%2==0 && i%6==0)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("the count of number which is divisible by 2 and 6="+count);
	}

}
