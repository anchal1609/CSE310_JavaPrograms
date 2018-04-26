/* WAP to create a class bank-account having instance variable balance 
Implement a method deposit(int amt) which receives the amount to be deposited as an argument and adds to the current balance .
Implement another method withdraw() which asks the user to enter the amount withdrawn and updates the balance if having sufficient balance and return the new balance.
Invoke both the methods from TestBankAccount class .*/
import java.util.*;
class BankAcc
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    double totalAmt, withAmt;
    int ch;
    System.out.println("What you what to do? \n");
    while(ch!=4)
    {
      System.out.println("Press 1 to Deposit Amount.\nPress 2 to Withdrawn Amount.\nPress 3 to Check Amount.");
      ch = obj.nextInt();
      switch(ch)
      {
        case 1:
              totalAmt = deposit(abc);
              break;
        case 2:
              System.out.println("Kitne nikalna hai ? ");
              double wAmt = obj.nextInt();
              withAmt = withdrawn(wAmt);
              break;
        case 3:
              //System.out.println("Apke pass Abhi hai ₹"+totalAmt+" only");
              checkAcc();
              break;
      }
    }
  }
  public static double deposit(double d)
  {
    Scanner obj1 = new Scanner(System.in);
    System.out.println("Kitne paise jama kerna hai ?");
    d = obj1.nextInt();
    if (d>500000)
    {
      System.out.println("Apke aukat nahi hai itne hehhehehehe kam thoda.");
    }
    return d;
  }
  public static double withdrawn(double w)
  {
    // if (w > totalAmt)
    // {
    //   System.out.println("Itne tho hai he nahi apke Acc mai .");
    // }
    // else
    // {
    //   totalAmt = totalAmt - w;
    // }
    return w;
  }
  public static void checkAcc()
  {
    // System.out.println("Apke pass Abhi hai ₹"+totalAmt+" only");
  }
}
