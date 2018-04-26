abstract class Person 
{
	abstract void eat();
}
class TestAnonymousInner
{
	public static void main (String args[])
	{
		//Inside a method(main)only, Anonymoush class is declared
		Person p = new Person()
		//Statement do not end with semicolon (as we cannot create object for abstract class or interface)
		{
			void eat()
			{
				System.out.println("nice fruits");
			}
		};
		Person p1 = new Person()
		{
			void eat()
			{
				System.out.println("Hello");
			};
		};
		p1.eat();
		p.eat();
	}
}