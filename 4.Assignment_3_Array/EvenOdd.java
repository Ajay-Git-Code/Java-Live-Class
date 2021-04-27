import java.util.Scanner;

public class EvenOdd
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
		int even =0,odd = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(i % 2 != 0)
			{
				even = even +arr[i];
			}
			else
			{
				odd = odd + arr[i];
			}
		}
		System.out.println("even = "+even+" odd = "+odd);
	}
	
}