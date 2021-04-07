import java.util.Scanner;

class BetweenNumber
{
	private int n1,n2;
	
	public void get()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number. ");
		n1 = s.nextInt();
		n2 = s.nextInt();
	}
	
	public void operation()
	{
		boolean d;
		d=(n1 != n2)?true:false;
		if(d)
		{
			if(n1>n2)
			{
				for(int i = n2;i<=n1;i++)
				{
					if((i%3 ==0)&&(i%5==0))
					{
						System.out.println(i);
					}
				}
			}
			else
			{
				for(int i = n1;i<=n2;i++)
				{
					if((i%3 ==0)&&(i%5==0))
					{
						System.out.println(i);
					}
				}
			}
		}
		else
		{
			System.out.println("Equal value not allow");
		}
	}
	
}

public class Between
{
	public static void main(String []args)
	{
		BetweenNumber b = new BetweenNumber();
		b.get();
		b.operation();
	}
}