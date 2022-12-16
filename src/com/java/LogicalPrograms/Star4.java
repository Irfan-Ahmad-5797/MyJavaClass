package com.java.LogicalPrograms;
//    *
//   **
//  ***
// ****
//*****

// ****
//  ***
//   **
//    *
public class Star4 {
	public static void main(String[] args) {
		int rows=5, space=4, star=5;
		for(int i=1; i<=rows; i++)//for rows
		{
			for(int j=space; j>=i; j--)//space
			{
				System.out.print(" ");
			}
				for(int k=1; k<=i; k++)//for star
			{
					System.out.print("*");
			}
				
				System.out.println();
		}
		// second part
		int rows2=4, space2=4, star2=4;
		for(int i=1; i<=rows2; i++)// for rows
		{
			for(int j=1; j<=i; j++)//for space
			{
				System.out.print(" ");
			}
			for(int k=star2; k>=i; k--)//for star
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
