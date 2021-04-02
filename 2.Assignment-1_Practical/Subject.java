class Subject
{
	public static void main(String []args)
	{
		int i;
		boolean fail = true;
		for(i=0;i<5;i++)
		{
			if(Integer.parseInt(args[i])<35)
			{
				if(fail)
				{
					System.out.println("Failed");
					fail = false;
				}
				System.out.println(" "+(i+1));
			}
		}
	}
}