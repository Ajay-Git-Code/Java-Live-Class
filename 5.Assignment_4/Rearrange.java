import java.util.Scanner;
import java.util.Arrays;
class Rearrange
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of item");
		int x = s.nextInt();
		int [] arr = new int[x];
		System.out.println("Enter digit ");
		for(int i = 0; i<arr.length;i++)
		{
			
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0;i<arr.length/2;i++)
		{
			int hold = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = hold;
		}
		for(int y:arr)
		{
			System.out.println(y);
		}
	}
}