import java.util.Scanner;


class Branches
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of Branch");
		int b = s.nextInt();
		int [][] branch = new int [b][];
		
		for(int i =0;i<branch.length;i++)
		{
			System.out.println("Enter no course ");
			int x = s.nextInt();
			branch[i] = new int[x];
			for(int j = 0;j<branch[i].length;j++)
			{
				System.out.println("Enter no of student ");
				branch[i][j] = s.nextInt();
			}
		}
		
		for(int [] hold :branch)
		{
			int noStudent=0;
			for(int stud :hold)
			{
				noStudent +=stud;
			}
			System.out.println("no of Student "+noStudent);
		}
	}
}