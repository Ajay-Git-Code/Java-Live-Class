import java.util.Scanner;

class PrimeNumber
{
	private int n1,n2;
	
	public void get()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number ");
		n1 = s.nextInt();
		n2 = s.nextInt();
	}
	
	public void primeCheck()
	{
		boolean b;
		b = (n1 != n2)?true:false;
		if(b)
		{
			if(n1>n2)
			{
				int i,j;
				outter : for( i = n1-1;i>n2;i--)
				{
					inner : for( j = 2;j<i;j++)
					{
						if( i%j == 0)
							continue outter;
					}
					System.out.println(i);
				}
			}
			else
			{
				int i,j;
				outter : for( i = n2-1;i>n1;i--)
				{
					inner : for( j = 2;j<i;j++)
					{
						if( i%j == 0)
							continue outter;
					}
					System.out.println(i);
				}
			}
		}
		else
		{
			int j;
			for( j = 2;j<n1;j++)
			{
				if( n1%j == 0)
					break;
			}
			if(j == n1)
			{
				System.out.println(j);
			}
		}
	}
}

public class Prime
{
	public static void main(String []args)
	{
		PrimeNumber p = new PrimeNumber();
		p.get();
		p.primeCheck();
	}
}