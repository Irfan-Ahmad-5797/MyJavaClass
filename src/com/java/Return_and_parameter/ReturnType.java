package com.java.Return_and_parameter;

public class ReturnType 
{
	public static int additon(int a, int b)
	{
		int sum =a+b;
		System.out.println(sum);
		return sum;
	}
	public static int subtraction(int i, int j)
	{
		int sub =i-j;
		System.out.println(sub);
		return sub;
	}
	public static void multiplication(int x, int y)
	{
		int mult=x*y;
		System.out.println("valuve of multipilication="+mult);
	}
	public static void main(String[] args) 
	{
		int c = additon(10, 10);
		System.out.println("value of c="+c);
		int d = subtraction(20, 10);
		System.out.println("value of d="+d);
		multiplication(10, 10);
		
		
	}
}
