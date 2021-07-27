class FindLS
{
	public static void main(String []args)
	{
		int []n  = {10,22,11,25,45,78,98,3,24,13};
		int large= n[0],small=n[0];
		for(int x :n)
		{
			if(x>large)
			{
				large = x;
			}
			if(x<small)
			{
				small = x;
			}
		}
		System.out.println("large "+large+" small "+small);
	}
}