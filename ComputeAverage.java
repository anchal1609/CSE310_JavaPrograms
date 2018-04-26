import java.util.*;
class ComputeAverage
{
  static double num1,num2,num3,avg;
  public static void main (String [] arg)
  {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter 1st value - ");
    num1 = obj.nextDouble();
    System.out.println("Enter 2nd value - ");
    num2 = obj.nextDouble();
    System.out.println("Enter 3rd value - ");
    num3 = obj.nextDouble();
    avg = (num1+num2+num3)/3;
    System.out.println("Average will be -  "+avg);
  }
}
