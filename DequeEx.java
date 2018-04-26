import java.util.*;
public class DequeEx
{	
	public static void main(String[] args) 
	{
		Deque<String>deque = new ArrayDeque<String>();
		deque.offer("Arvind");
		deque.offer("Vimal");
		deque.add("mukul");
		deque.offerFirst("jai");
		System.out.println("After offerFirst Traversal..");
		for(String s:deque)
		{
			System.out.println(s);
		}
		deque.pollLast();
		System.out.println("After the pollLast() Traversal..");
		for (String s:deque) 
		{
			System.out.println(s);	
		}
	}
}