import java.util.Scanner;

class Fibonacci
{
	public static void main(String []args)
	{
		
		/*int a = -1,b = 1,c;
		for(int i = 0; i<5;i++)
		{
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}*/
		
		
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of size ");
		x = s.nextInt();
		int []arr = new int[x];
		System.out.println("Enter a value ");
		for(int i = 0; i<arr.length;i++)
		{
			arr[i] = s.nextInt();
		}
		int a ,b,c,count=0;
		outter:for(int i = 0;i<arr.length;i++)
		{
			//System.out.println("for");
			a = -1;
			b = 1;
			c = a+b;
			
			while(arr[i]>=c)
			{
				//System.out.println("while");
				if(c == arr[i])
				{
					count++;
					continue outter;
				}
				a = b;
				b = c;
				c = a+b;
			}
		}
		System.out.println(count);

	}
}