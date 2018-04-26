import java.io.*;
public class FileOutputStramEx1
{
	public static void main(String [] args)
	{
		try 
		{
			File fout = new File("test2.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success...");
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
	}
}