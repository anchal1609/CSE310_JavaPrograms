class TestMultipleCatchBlock1
{
	public static void main(String[] args) 
	{
		try
		{
			int a[] = new int[5];
			a[5] = 30/0;
 		}	
 		catch (Exception e)
 		{
 			System.out.println("commom=n task completed");
 		}
 		catch(ArithmaticException e)
 		{
 			System.out.println("task 1 is completed");
 		}
 		catch(ArrayIndexOutOfBoundsException e)
 		{
 			System.out.println("task 2 completed");
 		}
 		System.out.println("rest of the code...");
	}
}