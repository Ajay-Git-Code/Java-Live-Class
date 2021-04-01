class labeledDemo
{
	public static void main(String []args)
	{
		int a = 10,b = 20,i,j;
		
		outter: for(i = 1; i<a;i++)
		{
			if(i == a)
			{
				break inner;
			}
		}
		inner: for(j = 1; j<b;j++)
		{
			if(j == b)
			{
				//break outter;	
			}
		}
	}
}