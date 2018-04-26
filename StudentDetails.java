import java.util.Scanner;
class StudentDetails
{
	public static void main (String[] arg)
	{
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter your name - ");
		String name = obj1.next();
		System.out.println("Enter your Roll no. -");
		int rollno = obj1.nextInt();
		System.out.println("Enter your phone number -");
		int phoneNo = obj1.nextInt();
		System.out.println("Your all details is:- "+"Name-"+ name +"Phone Number-"+phoneNo + "Roll Number-"+rollno);
	}
}
