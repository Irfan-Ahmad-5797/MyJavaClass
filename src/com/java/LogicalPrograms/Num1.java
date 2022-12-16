package com.java.LogicalPrograms;
//1
//11
//111
//1111
//11111
//rows=5, num=5,
public class Num1 {
	public static void main(String[] args) {
		int row=5, num=5;
		for (int i=1; i<=row; i++)//for rows
		{
			for (int j=1; j<=i;j++ )//for num
			{
				System.out.print(1);
			}
			System.out.println();
		}
	}

}
