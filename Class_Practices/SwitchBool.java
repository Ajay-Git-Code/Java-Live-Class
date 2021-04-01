class SwitchBool
{
	public static void main(String[]args)
	{
		boolean a = true;
		
		switch(a)
		{
			case true:
				System.out.println("true case");
				break;
			case false:
				System.out.println("false case");
				break;
			default:
				System.out.println("invlaid boolean");
		}
	}
}