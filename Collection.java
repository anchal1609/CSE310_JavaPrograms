import java.util.*;
public class Collection
{
	public static void main(String args[])
		{
			ArrayList<String> al=new ArrayList<String>();
			al.add("Amit");
			al.add("Vijay");
			al.add("Kumar");
			al.add(0,"Sachin"); 
			System.out.println("Element at 2nd position: "+al.get(2));
			ListIterator<String> itr=al.listIterator();
			System.out.println("Traversing elemnets in forward direction...");
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println("Traversing elements in backwards direction...");
			while(itr.hasPrevious())
			{
				System.out.println(itr.previous());
			}
		}
}