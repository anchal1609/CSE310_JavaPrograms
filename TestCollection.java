import java.util.*;
class TestCollection
{
  public static void main(String[] args)
  {
    ArrayList<String>al = new ArrayList<String>();
    ArrayList<Integer>alr = new ArrayList<Integer>();
    int a = 1234;
    int b = -1234;
    al.add("Ravi");
    al.add("Vijay");
    al.add("Monica");
    al.add("Joye");
    al.add("Ross");
    al.add("Pheobe");
    alr.add(a);
    alr.add(b);
    for(String obj:al)
    {
      System.out.println(obj);
    }
    for(Integer obj1:alr)
    {
      System.out.println(obj1);
    }
  }
}
