import java.util.*;
class LeapYear
{
        public static void main(String[] args) {

                Scanner obj = new Scanner(System.in);
                int year = obj.nextInt();
               boolean ans =((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
               System.out.println(ans);
        }
}
