class WhileDemo
{
	public static void main(String []args)
	{
		int a = 10;
		int b = 20;
		while(a<=b)
		{
			if(a % 2 == 0)
			{
				System.out.println(a+" is even");
			}
			a++;
		}
		
	}
}