import java.io.FileInputStream;
class FileInputStreamEx2
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin = new FileInputStream("UserFile.txt");
			int i = 0;
			while((i=fin.read())!= -1)
			{
				System.out.print((char)i);
			}
			System.out.println();
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}