import java.io.FileOutputStream;
import java.util.*;
public class FileOutputStreamEx3
{
	public static void main(String[] args)
	{
		try 
		{
			FileOutputStream fout = new FileOutputStream("UserFile.txt");
			Scanner obj = new Scanner(System.in);
			String s = obj.nextLine();
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success..."); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}