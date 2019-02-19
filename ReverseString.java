package com.String;
import java.util.Scanner;

	public class ReverseString
	{
		public static void main(String[] args)
		
		{
			/*String str1="Sushovan";
			System.out.println("Enter string to reverse:");
			Scanner read = new Scanner(System.in);
			String str = read.nextLine();
			
			StringBuilder sb = new StringBuilder(str);
			System.out.println("Reversed string is:");
			System.out.println(sb.reverse().toString());
			
			StringBuilder sb1=new StringBuilder(str1);
			System.out.println("THe Reverse POrder String Is:");
			System.out.println(sb1.reverse().toString());*/
			
			String str="Sushovan";
			String reverse=" ";
			for(int i=7;i>=0;i--)
			{
			    reverse=reverse+str.charAt(i);
			}
		System.out.println("The Reverse Order String is:");
		System.out.println(reverse);
		}
	}
		
			
				
			
		
	

