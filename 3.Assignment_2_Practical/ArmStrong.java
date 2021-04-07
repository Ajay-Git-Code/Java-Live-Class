import java.util.Scanner;


class ArmStrongNumber
{
	private String a = new String();
	private int num,count;
	
	
	public void get()
	{
		System.out.println("Enter a number ");
		Scanner s = new Scanner(System.in);
		a = s.next();
		num = Integer.parseInt(a);
		count = a.length();
	}
	public void check()
	{
		int sum,total = 0;
		for(int i = 0; i<count;i++)
		{
			sum = 1;
			for(int j = 0; j<count; j++)
			{
				sum *= Character.getNumericValue(a.charAt(i));
				//System.out.println(sum);
			}
			total +=sum;
		}
		if(num == total)
		{
			System.out.println("ArmStrongNumber");
		}
		else
		{
			System.out.println("not ArmStrongNumber");
		}
	}
}


public class ArmStrong
{
	public static void main(String []args)
	{
		ArmStrongNumber a = new ArmStrongNumber();
		a.get();
		a.check();
	}
}