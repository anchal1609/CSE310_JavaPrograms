
import java.lang.Math;
import java.util.*;
import java.io.*;

class JavaLoops{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        JavaLoops obj = new JavaLoops();
        int sum; 
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int k=0;k<n;k++)
            {
                sum = a;
                for (int j=1;j<n ;j++) 
                {
                  sum = b * (2+j);  
                }
                System.out.print(sum+" ");
            }
        }
    }
}

