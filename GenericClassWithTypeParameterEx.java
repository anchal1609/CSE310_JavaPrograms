class TwoGen<T,V>
{
	T ob1;
	V ob2;
	TwoGen(T o1,V o2)
	{
		ob1 = o1;
		ob2 = o2;
	}
	void showTypes()
	{
		System.out.println("Type of T is "+ ob1.getClass().getName());
		System.out.println("Type of T is "+ ob2.getClass().getName());		
	}
	T getobj1()
	{
		return ob1;
	}
	V getobj2()
	{
		return ob2;
	}
}
class GenericClassWithTypeParameterEx
{
	public static void main(String[] args) 
	{
		TwoGen<Integer,String>t	= new TwoGen<Integer,String>(16920,"Hello");
		t.showTypes();
		int v = t.getobj1();
		System.out.println("Value: "+v);
		String str = t.getobj2();
		System.out.println("Value: "+str);
	}
}