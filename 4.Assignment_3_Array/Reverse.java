import java.util.Scanner;

public class Reverse
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
		
		for(int i = 0; i<(arr.length/2);i++)
		{
			int hold = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = hold;
		}
		
		for(int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}	
}