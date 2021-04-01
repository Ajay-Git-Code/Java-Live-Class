class Labeled
{
	public static void main(String []args)
	{
		int a = 20,b = 30,i,j;
		
		outter: for(j=a;j<=b;j++)
		{
			for(i = 2;i< j;i++)
			{
				if(j % i == 0)
				{
					continue outter;
				}
			}
			System.out.println(j+" is prime");
		}
	}
}