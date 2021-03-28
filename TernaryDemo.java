import java.util.Scanner;

class TernaryDemo
{
	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Three No - ");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		String str = (x>y)?(x>z)?x+" is greatest":z+" is greatest":(y>z)?y+" is greatest":z+" is greatest";
		System.out.println(str);
	}
}