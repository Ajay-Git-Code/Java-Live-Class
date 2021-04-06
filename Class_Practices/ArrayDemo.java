import java.util.Scanner;

class ArrayDemo
{	
	public static void main(String []args)
	{
		int [] arr = new int [5];
		Scanner s = new Scanner (System.in);
		System.out.println("Enter 5 no");
		
		for(int i = 0;i<5;i++)
		{
			arr[i] = s.nextInt();
		}
		
		for(int i = 0;i<5;i++)
		{
			System.out.println("Index "+i+" value is "+arr[i]);
		}
	}
}