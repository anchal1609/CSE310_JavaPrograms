// Java program to demonstrate syntax of assertion
import java.util.Scanner;
 
class AssertionEx
{
    public static void main( String args[] )
    {
        Scanner obj = new Scanner(System.in);
        int value = obj.nextInt();
        assert value >= 20 : " Underweight";
        System.out.println("value is "+value);
    }
}