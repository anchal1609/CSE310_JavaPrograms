import java.util.*;
class Collection11
{
	 public static void main(String args[])
	 {
	   TreeSet<String> al=new TreeSet<String>();
	   al.add("Ravi");
	   al.add("Vijay");
	   al.add("Ravi");
	   al.add("Ajay");
	   Iterator itr=al.iterator();
	   while(itr.hasNext())
	   {
          System.out.println(itr.next());
       }
     }
}