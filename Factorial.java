import java.util.*;
class Factorial
{
  public static void main(String[] arg)
  {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter any number - ");
    int fac = obj.nextInt();
    int fact = 1,i;
    for (i=fac; i>0; i--)
    {
       fact = fact*i;
    }
    System.out.println("Factorial is " + fact);
  }
}
