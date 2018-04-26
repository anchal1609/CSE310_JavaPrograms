class NestedTry
{
	try
	{
		try
		{
			System.out.println("Going to divide...");
			int b = 30/0;
		}
		catch(ArithmeticExpception e)
		{
			System.out.println(e);
		}
		
		try
		{
			int a[] = new int[5];
			a[5] = 4;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Other statements");
		}	
	}
	catch(Exception e)
	{
		System.out.println("handeled...");
	}
	System.out.println("Normal flow..")
}

