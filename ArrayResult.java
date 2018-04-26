import java.util.*;
class ArrayResult
{
  public static void main (String[] arg)
  {
    Scanner obj = new Scanner(System.in);
    System.out.println("How many subject ? - ");
    int n = obj.nextInt();
    int marks[] = new int[n];
    double result = 0.0;
    int sum = 0;
    System.out.println("Enter the marks ");
    for (int i=0; i<n; i++)
    {
      System.out.println("Subject "+i+1+" Marks - ");
      marks[i] = obj.nextInt();
      marks[i] = marks[i]/10;
      sum = sum + marks[i];
    }
    result = sum / n;
    System.out.println("CGPA -" + result);
    System.out.println("Your Result will be - "+result*9.5+"%");
  }
}
