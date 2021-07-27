

public class Test
{
	public static void main(String []args)
	{
		outter:for( int a = 1;a<3;a++)
		{
			System.out.println("a"+a);
			inner:for(int b = 1;b<2;b++)
			{
				System.out.println("b"+b);
			}
			if(a == 1)
				continue inner;
		}
				
		//System.out.println(a);
	}
}

