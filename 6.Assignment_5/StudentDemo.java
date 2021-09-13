import java.util.Scanner;

class Student
{
	public int rollNo,totalMarks;
	public String name;
	
	public Student(String name,int rollNo,int totalMarks)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.totalMarks = totalMarks;
	}
	public void display()
	{
		System.out.println("name "+name);
		System.out.println("roll no "+rollNo);
		System.out.println("totalMarks "+totalMarks);
	}
}

public class StudentDemo
{
	public static void main(String []args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of Student");
		int x = s.nextInt();
		Student [] arr = new Student[x];
		// Initialize Details
		for(int i = 0; i<arr.length;i++)
		{
			s.nextLine();
			System.out.println("Enter name,roll No, TotalMarks");
			String name = s.nextLine();
			int rollNo = s.nextInt();
			int totalMarks = s.nextInt();
			arr[i] = new Student(name,rollNo,totalMarks);
		}
		//Find topper
		Student topper = null;
		for(Student temp :arr)
		{
			if(topper == null)
			{
				topper = temp;
			}
			else if( topper.totalMarks<temp.totalMarks)
			{
				topper = temp;
			}
		}
		topper.display();
	//System.out.println("name " +topper.name+" roll No "+topper.rollNo+" total marks "+topper.totalMarks);
	}
	
}