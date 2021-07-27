class Base
{
	public static int x = 4;
/*	
	public void show ()
	{
		System.out.println("in Base Show");
	}
	public static void display()
	{
		System.out.println("in display of base");
	}
*/
/*
	private Base()
	{
		System.out.println("in Base");
	}
	//Factory method 
	public static Base getBase()
	{
		return new Base();
	}
	
	public void show()
	{
		System.out.println("in show");
	}
*/
/*
	public static int x = 10;
	public int y = 20;

	public void show()
	{
		System.out.println(x+" "+y);
	}
	// to access static member
	public static void show()
	{
		System.out.println(x);
	}
	public void add()
	{
		System.out.println(x+y);
	}
*/
}

class Child extends Base
{
	public static void show(){
	System.out.println(x+6);
	}
/*
	public static void display()
	{
		System.out.println("in display of Child");
	}
	public void show()
	{
		System.out.println("in Child Show");
		//return x;
	}
	public Child()
	{
		System.out.println("in Child");
	}
*/
/*
	public void sub()
	{
		System.out.println(x-y);
	}
*/
}

class InheritanceDemo
{
	public static void main(String []args)
	{
		//Base obj1 = new Base();
		//obj1.display();
		Child obj = new Child();
		//Base obj = Base.getBase();

		//obj.display();
		obj.show();
		//System.out.println(obj.x);
		
		//obj.show();
		//obj.add();
		//obj.sub();
		//System.out.println(obj.x+" "+obj.y);
	}
}