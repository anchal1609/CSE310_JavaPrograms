import java.util.*;
class DisplayTime
{
  public void display()
  {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the seconds in integer - ");
    int sec = obj.nextInt();
    float min = sec/60;
    float hours = seconds / 3600;
    float minutes = (seconds%3600)/60;
    int seconds_output = (seconds% 3600)%60;
    System.out.println("Time is - "+hours+":"+minutes+":"+seconds_output);
  }
}
