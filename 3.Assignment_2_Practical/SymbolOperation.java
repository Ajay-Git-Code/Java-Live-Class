import java.util.Scanner;

class Symbol
{
	private int a,b;
	private String str  = new String();
		
	public void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number and Symbol");
		a = s.nextInt();
		b = s.nextInt();
		str = s.next();
	}
	
	public void operation()
	{
		switch(str)
		{
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "x":
				System.out.println(a*b);
				break;
			case "/":
				System.out.println(b/a);
				break;
			default:
				System.out.println("Invalid operator");
		}
	}
}

public class SymbolOperation
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		boolean b;
		Symbol a = new Symbol();
		do
		{
			a.input();
			a.operation();
			b = s.nextBoolean();
		}while(b !=false);
	}
}