class ShortCircuit
{
  public static void main (String arg[])
  {
    int x = 10, y = 5;
    if (x == 11 && --y == 6)
    {
      System.out.println("Hello");
      System.out.println(y);
    }
    else
    {
      System.out.println("Hii");
      System.out.println(y);
    }

  }
}
