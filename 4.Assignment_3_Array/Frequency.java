import java.util.Scanner;

public class Frequency
{
	public static void main(String []args)
	{	
		int x;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of user");
		x = s.nextInt();
		int []arr = new int[x];
		System.out.println("Enter value");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = s.nextInt();
		}
		
		int count=0,hold=0;
		outter : for(int i = 0; i<arr.length;i++)
		{
			count = 0;	
			for(int j = 0;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					if(count == arr.length-1)
					{
						System.out.println("all frequency are same");
						break outter;
					}
				}
				
			}
			if(count >(arr.length/2))
			{
				hold = arr[i];
				//System.out.println(arr[i]+" frequency " +count);
				break;
			}
			else if(hold<count)
			{
				hold = arr[i];
			}
			
		}
		 if(count != arr.length-1)
		 {
			 System.out.println(hold);
		 }
	}
}