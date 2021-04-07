import java.util.Scanner;

class DigitNumber
{
	private int n,k;
	
	
	public void get()
	{
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		k = s.nextInt();
	}
	
	public void find()
	{
		int i,rem=0;
		for(i = 1; i<=k;i++)
		{
				rem = n%10;
				n = n/10;
				if(n == 0)
					break;
		}
		if(k> i)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println(rem);
		}
		
		
	}
	

}

public class Digit
{
	public static void main(String []args)
	{
		DigitNumber n = new DigitNumber();
		n.get();
		n.find();
	}
	
}