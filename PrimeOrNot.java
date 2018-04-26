import java.util.*;
class PrimeOrNot
{
  public static void main (String[] arg)
  {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter Number - ");
    int x = obj.nextInt();
    if ((x%2)==0)
    {
      System.out.println("NOT Prime");
    }
    else
    {
      System.out.println("Prime");
    }
  }
}
