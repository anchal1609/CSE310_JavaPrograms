//page 445 book java
class Person
{
//name, address, phone no, email
	String name = "Arun Chaudhary";
	String Address = "Super long address here";
	String pno = "9803434005";
	String email = "i@amarun.tech";
}
class Student extends Person
{
//status constant
	String status = "Freshmen";
	void toString()
	{
		System.out.println("I am Student Class");
	}
}
class Employee extends Person
{
//office,salary,date hired
	String office = "Office Name";
	int salary = 900000;
	String doh = "24-03-1998";
	void toString()
	{
		System.out.println("I am Employee Class");
	}
}
class Faculty extends Employee
{
//office hours, rank
	String ohrs = "9 to 5";
	String rank = "Bda Aadmi";
	void toString()
	{
		System.out.println("I am Faculty Class");
	}
}
class Staff extends Employee
{
//title
	String title = "Boht bda Aadmi";
	void toString()
	{
		System.out.println("I am Staff Class");
	}
}
class InheritanceProgram
{
	public static void main(String args[])
	{
		//kuch krlo
		Staff obj1 = new Staff();
		obj1.toString();
	}
}