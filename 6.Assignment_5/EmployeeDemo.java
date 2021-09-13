import java.util.Scanner;

class Employee
{
	private int id,sal,commission;
	private String name;
	
	public Employee(String name,int id,int sal,int commission)
	{
		this.name =name;
		this.id = id;
		this.sal = sal;
		this.commission = commission;
	}
	
	public void dispaly()
	{
		System.out.println("name "+name);
		System.out.println("id "+id);
		System.out.println("sal "+sal);
		System.out.println("Commission "+commission);
	}
}

class EmpolyeeDemo
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Employee []noOfEmp = new Employee[n];
	}
}