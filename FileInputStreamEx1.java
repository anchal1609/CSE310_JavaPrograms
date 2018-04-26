import java.io.FileInputStream;  
public class FileInputStreamEx1
{  
     public static void main(String args[])
     {    
          try
          {    
            FileInputStream fin=new FileInputStream("test2.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }
          catch(Exception e)
          {
          	System.out.println(e);
          }    
     }    
}  