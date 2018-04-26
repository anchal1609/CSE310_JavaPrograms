import java.util.*;
class DayOfWeek
{
  public static void main(String[] args)
  {
      String ch;
      double d1 = 1_22.7;
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter the day of the week(Mon,Tue,Wed,Thu,Fri,Sat,Sun) - ");
      ch = obj.nextLine();
      switch (ch)
      {
        case "Mon":
              System.out.println("The Business in open from 11 to 5 on Mon");
              break;
        case "Tue":
              System.out.println("The Business in open from 12 to 3 on Tue");
              break;
        case "Wed":
              System.out.println("The Business in open from 4 to 5 on Wed");
              break;
        case "Thu":
              System.out.println("The Business in open from 9 to 5 on Thu");
              break;
        case "Fri":
              System.out.println("The Business in open from 1 to 9 on Fri");
              break;
        case "Sat":
              System.out.println("The Business in open from 3 to 6 on Sat");
              break;
        case "Sun":
              System.out.println("The Business in not open on Sunday");
              break;

        default:
          System.out.println("Enter a vaid choice .!. ");
      }
  }
}
