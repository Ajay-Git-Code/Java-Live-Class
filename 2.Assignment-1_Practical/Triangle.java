import java.util.Scanner;

class Triangle
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter three side of triangle");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d,e;
		if(a>b)
		{
			if(a>c)
			{
				d = a*a;
				e = b*b+c*c;
			}
			else
			{
				d = c*c;
				e = a*a+b*b;
			}
		}
		else if(b>c)
		{
			d = b*b;
			e = a*a+c*c;
		}
		else
		{
			d = c*c;
			e = a*a+b*b;
		}
		
		if(d == e)
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(-1);
		}
		
	}
}