import java.util.Scanner;

class Prime
{
	public static void main(String []args)
	{
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
		int sum = 0;
		outter : for(int i = 0;i<arr.length;i++)
		{
			inner : for(int j = 2;j<arr[i];j++)
			{
				if(arr[i]%j ==0)
				{
					continue outter;
				}
			}
			sum = sum +arr[i];
		}
		
		System.out.println("prime sum "+sum);
	}
}