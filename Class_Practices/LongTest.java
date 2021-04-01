class LongTest
{
	public static void main(String []args)
	{
		long a = 9223372036854775807l;
		 long b = 9223372036854775807l;
		long d = 9223372036854775807l;
		long c = (long)(a+b+d);
		System.out.println(c);
	}
}