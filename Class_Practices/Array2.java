import java.util.Scanner;
public class Array2
{
	public static void main(String [] args)
	{
		int [][]arr = new int [3][4];
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				arr[i][j] = 10;
			}
		}
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}