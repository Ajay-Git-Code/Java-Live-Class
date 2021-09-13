import java.util.Scanner;

class Test
{
	String n;
	
	public Test(String n)
	{
		this.n = n;
	}
	
	public void display()
	{
		System.out.println("in display "+n);
	}
	
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		//System.out.println(str);
		Test t = new Test(str);
		t.display();
	}
}