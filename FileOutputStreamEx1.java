import java.io.FileOutputStream;  
public class FileOutputStreamEx1 
{  
    public static void main(String args[])
    {    
           try
           {    
             FileOutputStream fout=new FileOutputStream("test2.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }
            catch(Exception e)
            {
            	System.out.println(e);
            }    
      }    
}