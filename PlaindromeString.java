package com.String;

public class PlaindromeString 
{

	public static void main(String[] args) 
	{
		String str="madam";
		String b=" ";
		for(int i=4;i>=0;i--)
		{
			b=b+str.charAt(i);
		}
		
		
		if(str.equals(b))
		{
		
			System.out.println("This is a Palindrome String");
		}
		
		else
		{
			System.out.println("This is not a Palindrome String");
		}
		

	}

}
