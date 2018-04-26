import java.util.*;
class BoolLogic
{
  public static void main (String arg[])
  {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the value of A True or False - ");
      boolean a = obj.nextBoolean();
      System.out.println("Enter the value of B True or False - ");
      boolean a = obj.nextBoolean();
      int c = a|c;
      int d = a&b;
      int e = a^b;
      int f = (~a&b)|(a&~b);
      int g = ~a& 0x0f;
      System.out.println("a= "+a);
      System.out.println("b= "+b);
      System.out.println("a|b= "+c);
      System.out.println("a&b= "+d);
      System.out.println("a^b= "+e);
      System.out.println("!a&b|a&!b= "+f);
      System.out.println("!a= "+g);
  }

}
