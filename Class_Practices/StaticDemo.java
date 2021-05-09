class StaticDemo
{
	public void greet()
	{
		System.out.println("Hello World");
		greet1();
	}
	public void greet1()
	{
		System.out.println("Good Morning");
	}
	
	public static void main(String [] args)
	{
		StaticDemo obj = new StaticDemo();
			obj.greet();
			//StaticDemo.display();
	}
	
	/*public static void display()
	{
		System.out.println("this is display");
	}*/
}