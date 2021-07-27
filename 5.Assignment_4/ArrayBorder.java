import java.util.Scanner;

class ArrayBorder
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array n * m");
		int x = s.nextInt();
		int y = s.nextInt();
		int [][]arr = new int[x][y];
		System.out.println("Enter Array item");
		for(int i = 0; i<arr.length;i++)
		{
			for(int j= 0;j<arr[i].length;j++)
			{
				arr[i][j] = s.nextInt();
			}
		}
		int sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			
			if(i == 0 || i == (arr.length-1))
			{
				for(int j= 0;j<arr[i].length;j++)
				{
					sum = sum + arr[i][j];
				}
			}
			else
			{
				for(int j= 0;j<arr[i].length;j++)
				{
					if(j == 0 || j == (arr[i].length -1))
					{
						sum = sum +arr[i][j];
					}
				}
			}				
		}
		System.out.println("sum " +sum);
	}
}