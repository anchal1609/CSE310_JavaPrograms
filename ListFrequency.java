//WAP using appropriate collection to find out the number which occur exactly N times.
//Ex. :arr {1,3,4,3,1,1,2,3,2,4,5}
import java.util.*;
public class ListFrequency
{
	public static void main(String[] args) 
	{
		List<Integer>ll = new ArrayList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(4);
		ll.add(3);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(2);
		ll.add(1);
		System.out.println("Actual List :" + ll);
		System.out.println("Frequency : "+Collections.frequency(ll,1));
	}
}