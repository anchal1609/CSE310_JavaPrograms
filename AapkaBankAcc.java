import java.util.*;
class AapkaBankAcc
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    AapkaBankAcc account = new AapkaBankAcc(1000);
//    System.out.println("Press 1 to Deposit Amount.\nPress 2 to Withdrawn Amount.\nPress 3 to Check Amount.");
    account.deposit(100);
    account.withdraw(50);
    account.getBalance();
  }
  private double balance;

  public void deposit(double depositAmount)
  {
    balance = balance + depositAmount;
  }
  public void withdraw(double withdrawAmount)
  {
    if (withdrawAmount > balance)
    {
      System.out.println("Not Enough .!.");
    }
    else
    {
        balance = balance - withdrawAmount;
    }
  }
  public double getBalance()
  {
    return balance;
  }
}
