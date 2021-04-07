import java.util.Scanner;

class EvenNumber
{
	private int n1,n2,p;
	
	public void get()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two no and p-th term");
		n1 = s.nextInt();
		n2 = s.nextInt();
		p = s.nextInt();
	}
	
	public void evenNumberFind()
	{
		int count = 0;
		for(int i = n1; i<=n2; i++)
		{
			if(i %2 == 0)
			{
				count++;
				if(count == 3 )
				{
					System.out.println(i);
					count = 0;
				}
			}
		}
	}
}

public class Even
{
	public static void main(String []args)
	{
		EvenNumber e = new EvenNumber();
		e.get();
		e.evenNumberFind();
	}
}



