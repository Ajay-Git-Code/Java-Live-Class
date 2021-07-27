import java.util.Scanner;

class DigitCount
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter n digit number ");
		int x = s.nextInt();
		int count = 0,sum = 0;
		while(x>0)
		{
			int rem = x %10;
			x = x/10;
			count++;
			sum = sum +rem;
		}
		System.out.println("sum "+sum);
		System.out.println("Average "+(sum/count));
	}
}