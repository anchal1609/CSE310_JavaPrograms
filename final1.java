import java.io.*;
class final1
{
	public static void main(String[] args)
	{
		try
		{
			Student object2;
			FileInputStream fin = new FileInputStream("serial.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			object2 = (Student)ois.readObject();
			ois.close();
			System.out.println("object2: "+ object2);
		}
		catch(Exception e)
		{
			System.out.println("Exception during deserialization: "+e);
			System.exit(0);
		}
	}
}