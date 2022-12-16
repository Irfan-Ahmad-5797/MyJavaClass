package com.java.LogicalPrograms;
//*
//**
//***       first part
//****
//*****
           //divide into two part
//****
//***
//**         second part
//*
//rows=5, star=5
//rows=4, star=4
public class Star3 {
	public static void main(String[] args) {
		int rows=5, star=5;
		for (int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		// for second part
		int rows1=4, star1=4;
		for(int i=1; i<=rows1; i++)
		{
			for(int j=star1; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
