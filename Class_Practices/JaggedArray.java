import java.util.Scanner;

class JaggedArray
{
	public static void main(String []args)
	{
		//int [][]arr = new int [][] {{10,20,30},{40,50,60},{70,80,90}};
		Scanner s = new Scanner (System.in);
		System.out.println("Enter how many salesman ");
		int x = s.nextInt();
		int [][]arr = new int [x][];
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println("Enter number of sales made by "+(i+1)+" person");
			x = s.nextInt();
			
			arr[i] = new int [x];
			
			System.out.println("Enter sales values ");
			
			for(int j = 0;j<arr[i].length;j++)
			{
				arr[i][j] = s.nextInt();
			}
		}
		
		int sum;
		for(int []brr:arr)
		{
			sum = 0;
			for(int y :brr)
			{
				sum +=y;
			}
			System.out.println(sum);
		}
		
		
	}
}