//a quick brown fox jumps over the lazy dog

import java.util.*;
class pangram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine().toLowerCase();
		int c[]=new int[26];
		char ch;
		for(int i=0;i<s.length();i++)
		{
			 ch=s.charAt(i);
			if(ch>='a' && ch<='z')
			{
				c[ch-'a']++;
			}
		}
		int m=0;
		for(int i=0;i<25;i++)
		{
			if(c[i]==0)
			{
				m++;
			}
		}
		if(m==0)
		{
			System.out.println("given string is pangram");
		}
		else
		{
			System.out.println("not pangram");
		}
	}
}

			