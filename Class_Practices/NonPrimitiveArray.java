class NonPrimitiveArray
{
	public static void main(String []args)
	{
		String s1 = "ram";		//new String ("Ram");
		String s2 =	new String ("ram");// "ram";
		if(s1==s2)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		//String []s = new String [3];
		//System.out.println(s[0]);
	}
} 