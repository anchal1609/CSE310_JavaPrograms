class FinallyBlock1
{
	public static void main(String[] args) 
	{
		try
		{
			int data = 25/0;
			System.out.println(data);
		}	
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("FinallyBlock always executed ");
		}
		System.out.println("Rest of the code");
	}
}