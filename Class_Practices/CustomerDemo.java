import java.util.Scanner;

class Customer
{
	private int account;
	private String name;
	private int bal;
	private double rate = 5.2;
	private double interest;
	
	public Customer(int account ,String name, int bal)
	{
		this.account = account;
		this.name = name;
		this.bal = bal;
	}
	
	public void calculate ()
	{
		interest = bal*5.2/100;
	}
	
	public void display ()
	{
		System.out.println(account+" "+name+" "+bal+" "+interest);
	}
}



public class CustomerDemo
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of Customer");
		int n = s.nextInt();
		Customer [] arr = new Customer[n];
		
		for( int i = 0;i<arr.length;i++)
		{
			System.out.println("Enter account no, name, bal");
			int account = s.nextInt();
			s.nextLine(); // clear input buffer after 1st input
			String name = s.nextLine();
			int bal = s.nextInt();
			arr[i] = new Customer(account,name,bal);
		}
		//object interest calculate
		for(Customer c :arr)
		{
			c.calculate();
		}
		//display object data
		for(Customer c :arr)
		{
			c.display();
		}
	}
}