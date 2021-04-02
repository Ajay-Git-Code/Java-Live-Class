class LeapYear
{
	public static void main(String []args)
	{
		int year = 1900 + Integer.parseInt(args[0]);
		String a = (year % 4 == 0)?(year % 100 ==0)?(year %400 == 0)?"leap":"not leap":"leap":"not leap";
		System.out.println(a);
	}
}

		/*if(year % 4 == 0)
		{
			if(year % 100 ==0)
			{
				if(year %400 == 0)
				{
					System.out.println("leap");
				}
				else
				{
					System.out.println("not leap");
				}
			}
			else
			{
				System.out.println("leap");
			}
			
		}
		else
		{
			System.out.println("not leap");
		}*/