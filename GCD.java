import java.util.*;
class GCD
{
  public static void main(String[] args)
  {
    Scanner obj = new Sacanner(System.in);
    GCD in = new GCD(System.in);
    int A,B;
    System.out.println("Enter the number for GCD \n");
    System.out.println("A : ");
    A = obj.nextInt();
    System.out.println("B : ");
    A = obj.nextInt();
    in.operation(A,B);
  }
  public static int operation(int a,int b)
  {
    int remainder =0,division =0;
    boolean finalEnd = True;
    while(finalEnd)
    {
      division = a/b;
      remainder = a%b;
      if(a == ((b*division)+remainder))
      {
        a = b;
        b = remainder;
      }
      else if(a==0||b==0)
      {
        in.finalGCD(a,b);
        finalEnd = False;
      }
    }
  }
  public static void finalGCD(int a,int b)
  {
    if (a==0||b==0)
    {
        if (a==0)
        {
            System.out.println("GCD is :"+a);
        }
        else
        {
            System.out.println("GCD is :"+b);
        }
    }
  }
}
