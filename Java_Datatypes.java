// byte 1 byte  -128 to -127
// short 2 bytes  -32,768 to 32,767
// int 4 bytes -2,147,483,648 to 2,147,483,647
// long 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,80
import java.util.*;
import java.io.*;

class Java_Datatypes{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
        
                if(x>=-32768 && x<=32767)System.out.println("* short");
                
                if(x>=-2147483 && x<=2147483647)System.out.println("* int");
                
               	if(x>=-9223372036854775808 && x<=922337203685477580)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}