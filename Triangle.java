import java.util.*;
class Triangle
{
	public static void main(String args[])
	{
		System.out.println("area and peremeter 0f triangle");
		Scanner sc=new Scanner(System.in);
		double ar;
		int br,h;
		System.out.println("area 0f triangle");
		System.out.println("br");
		br=sc.nextInt();
		System.out.println("h");
		h=sc.nextInt();
		ar=0.5 * br * h;
		System.out.println("peremeter 0f triangle");
		int a,b,c,p;
		System.out.println("a");
		a=sc.nextInt();
		System.out.println("b");
		b=sc.nextInt();
		System.out.println("c");
		c=sc.nextInt();
		p=a+b+c;
		System.out.println("area:"+ar+" and peremeter 0f triangle:"+p);
	}
}
