//Hierarchical Inheritance
class Principal
{
	void calling()
	{
	System.out.println("Calling...");
	}
}
class Teacher1 extends Principal
{
	void Teaching()
	{
		System.out.println("teaching...");
	}
}
class Teacher2 extends Principal
{
	void Counselling()
	{
		System.out.println("Counselling...");
	}
}
class Hierarchical
{
	public static void main(String args[])
	{
		Teacher2 t = new Teacher2();
		t.Counselling();
		t.calling();
	}
}