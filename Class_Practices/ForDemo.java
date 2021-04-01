class ForDemo
{
	public static void main(String []args)
	{
		int a = 5;
		int i;
		for(i = 2;i< a;i++)
		{
			if(a % i ==0)
			{
				break;
			}
		}
		if(i == a )
		{
			System.out.println(a+" is prime");
		}
		else
		{
			System.out.println(a+" is not prime");
		}
	}
}