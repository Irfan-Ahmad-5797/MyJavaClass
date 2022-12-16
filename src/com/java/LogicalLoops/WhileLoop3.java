package com.java.LogicalLoops;
//divisible by 3 and 5// 1 to 100
public class WhileLoop3 {
	public static void main(String[] args) {
		int count=0;
		int i=1;
		while (i<=100)
		{
			if (i%3==0 && i%5==0)
			{
				System.out.println(i);
				count++;// count=count+1
			}
			i++;
		}
		System.out.println("number which is divisible by 3 and 5="+count);		
	}

}
