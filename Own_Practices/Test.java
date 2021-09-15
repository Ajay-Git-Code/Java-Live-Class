import java.util.Scanner;

class Test
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		args[0] = Integer.toString(s.nextInt());
		System.out.println(args[0]);
	}
}