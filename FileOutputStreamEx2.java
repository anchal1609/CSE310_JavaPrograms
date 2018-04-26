import java.io.FileOutputStream;  
public class FileOutputStreamEx2 {  
    public static void main(String args[])
    {    
           try
           {    
             FileOutputStream fout=new FileOutputStream("testoutString.txt");    
             String s="Welcome to the real world! It's sucks you gonna like it.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }
            catch(Exception e)
            {
                System.out.println(e);
            }    
    }    
}                                            