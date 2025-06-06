import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c,n;
		System.out.println("enter n:");
		n=sc.nextInt();
		System.out.println("Fibonacci series:");
		System.out.println("a:"+a);
		System.out.println("b:"+b);	
		for(int i=2;i<n-1;i++)	
		{
			c=a+b;
			System.out.println("c:"+c);
			a=b;
			b=c;
		}
	}
}