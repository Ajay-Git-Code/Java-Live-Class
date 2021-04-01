class BreakDemo
{
	public static void main(String []args)
	{
		int a = 10,b = 20,i,j;
		
		for(j=a;j<=b;j++)
		{
			for(i = 2;i< j;i++)
			{
				if(j % i == 0)
				{
					break;
				}
			}
			if(i == j )
			{
				System.out.println(j+" is prime");
			}
		}
	}
}