package com.java.LogicalPrograms;
//1
//12
//123
//1234
//12345
public class Num4 {
	public static void main(String[] args) {
		int row=5;
		int num=5;
	
		for(int i=1;i<=5;i++)	//For rows
		{
			for(int j=1;j<=i;j++)	//For num
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
