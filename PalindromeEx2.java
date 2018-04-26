import java.util.*;
class PalindromeEx2
{
    public static boolean istPalindrom(char[] word)
    {
    int i1 = 0;
    int i2 = word.length - 1;
    while (i2 > i1) 
        {
            if (word[i1] != word[i2]) 
            //{
             throw new  ArithmeticException("NOT Palindrome String");
             //return false;
            //s}
             ++i1;
             --i2;
        }
        return true;
    }
     public static void main(String[] args )
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String word = obj.nextLine();
        char[] warray = word.toCharArray();
        istPalindrom(warray);
        System.out.println(istPalindrom(warray));
    }
}