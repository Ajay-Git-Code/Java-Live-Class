class StaticBlock
{
	public static int x;
	static
	{
		x = 10;
		System.out.println("in static block");
	}
	public StaticBlock()
	{
		System.out.println("in Constructor");
	}

	public static void display()
	{
		System.out.println("in display "+x);
	}
	public void show()
	{
		System.out.println("in show");
	}
}

class StaticBlockDemo
{
	//static int y = 30;
	static
	{
		System.out.println("Hello World");
		//System.out.println(y);
	}
	public static void main(String [] args) throws ClassNotFoundException
	{
		System.out.println(StaticBlock.x);
		StaticBlock.display();
		new StaticBlock().show();
		Class.forName("StaticBlock");
	}
}