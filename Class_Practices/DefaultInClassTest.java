class DefaultInClass
{
	private int a=10,b=20;
	
	public int sum()
	{
		//int a=5;
		//a = a;
		return a;
	}
	
}

class DefaultInClassTest
{
 public static void main(String []args)
 {
	 DefaultInClass a = new DefaultInClass();
	System.out.println(a.sum());
 }
 
}
