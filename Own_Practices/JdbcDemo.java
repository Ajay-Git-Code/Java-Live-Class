class JdbcDemo
{
	public static void main(String []args)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}