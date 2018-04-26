interface Eatable
{
	void eat();
}
class TestAnonymousInner2
{
	public static void main (String[] arg)
	{
		Eatable e = new Eatable();
		{
			public void eat()
			{
				System.out.println("Hello");
			};
		};
		e.eat();
	}
}