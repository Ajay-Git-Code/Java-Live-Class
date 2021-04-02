class SmallestNumber
{
	public static void main(String []args)
	{
		int a = 15,b = 2,c = 30,small;
		small = (a>b)?(b>c)?c:b:(a>c)?c:a;
		System.out.println(small);
	}
}