import java.util.Scanner;
class InputDemo
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two Number :");
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println("sum is :"+(x+y));
	}
} 