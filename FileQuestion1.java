import java.io.*;
import java.util.*;
class FileQuestion1
{
	public static void main(String[] args)
	{
		try
           { 
 			 Scanner obj = new Scanner(System.in);          	 
             FileOutputStream file1 = new FileOutputStream("BYOD1.txt");
             FileOutputStream file2 = new FileOutputStream("BYOD2.txt");
             System.out.println("Enter the String in file 1st : ");
             String s1 = obj.nextLine(); 
             System.out.println("Enter the String in file 2nd : ");
             String s2 = obj.nextLine();
             byte b1[]=s2.getBytes();    
             byte b2[]=s1.getBytes();
             file1.write(b1);
             file2.write(b2);
             System.out.println("String stored in a file successfully...");
             //System.out.println("File1 Name : "+ file1.getName());
             //System.out.println("File2 Name : "+ file2.getName());     
			 FileInputStream f1 = new FileInputStream("BYOD1.txt");
             FileInputStream f2 = new FileInputStream("BYOD2.txt");
			 System.out.println("Befor the Append function.!.");
			 System.out.println("File 1 String...");
			 int i = 0;
			 while((i=f1.read())!= -1)
				{
					System.out.print((char)i);
				}
			 System.out.println();
			 System.out.println("File 2 String...");
			 while((i=f2.read())!= -1)
				{
					System.out.print((char)i);
				}
			 System.out.println();
			 System.out.println("The Append function successful.!.");
    		 file2.write(b1);
             f1.close();
             f2.close();        
            }
            catch(Exception e)
            {
                System.out.println(e);
            }    
	}
}