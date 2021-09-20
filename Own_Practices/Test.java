import java.util.Scanner;

class Test
{
	public static void main(String []args)
	{
		String  a = "ABCDE";
		for(int i = 0;i<a.length();i++)
		{
			if(a.charAt(i) == 65)
				System.out.println("same");
			else
				System.out.println("diff");
		}
		//int b = 65;
		/*if(a == b)
			System.out.println("same");
		else
			System.out.println("diff");
		//Scanner s = new Scanner(System.in);
		//args[0] = Integer.toString(s.nextInt());
		//System.out.println(args[0]);*/
	}
}