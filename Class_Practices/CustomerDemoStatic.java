import java.util.Scanner;

class CustomerStatic 
{
	private int account,bal;
	private String name;
	private static double rate;
	private double interest;
	private static int count;
	
	public CustomerStatic(int account ,String name, int bal)
	{
		this.account = account;
		this.name = name;
		this.bal = bal;
		count++;
	}
	
	public static void getCount()
	{
		System.out.println(count);
	}
	
	public static void set(double r)
	{
		rate = r;
	}
	
	public static void get()
	{
		System.out.println(rate);
	}
	
	public void calculate ()
	{
		interest = bal*rate/100;
	}
	
	public void display ()
	{
		System.out.println(account+" "+name+" "+bal+" "+interest);
	}
}



public class CustomerDemoStatic
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		CustomerStatic.set(5.2);
		CustomerStatic.getCount();
		CustomerStatic c1 = new CustomerStatic(101,"Ram",12500);
		CustomerStatic c2 = new CustomerStatic(102,"Shyam",15000);
		c1.calculate();
		c2.calculate();
		c1.display();
		c2.display();
		CustomerStatic.getCount();
		CustomerStatic.get();
	}
}