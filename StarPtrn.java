class StarPtrn
{
	public static void main(String args[])
	{
		int n=5;
		System.out.println("pattern ");
		for(int i=1;i<=n;i++)
		{
			System.out.println();
			for(int j=1;j<=n-1;j++)
			{
				System.out.print(" ");
				for(int k=0;k<n;k++)
				{
					System.out.print(" *");
				}
			}
		}
	}
}