import java.util.Scanner;

class IfDemo
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Three No - ");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		
		if(x>y)
		{
			if(x>z)
			{
				System.out.println(x+" is greater");
			}
			else
			{
				System.out.println(z+" is greater");
			}
		}     
		else
		{
			if(y>z)
			{
				System.out.println(y+" is greater");
			}
			else
			{
				System.out.println(z+" is greater");
			}
		}
	}
}