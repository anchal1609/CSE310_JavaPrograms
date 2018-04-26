import java.util.*;
class HashMapEx
{
	public static void main(String[] args) 
	{
		//create and populate hash map
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		hm.put(100,"Let us C");
		hm.put(101,"Operating System ");
		hm.put(102,"Data Comunication and networking ");
		System.out.println("Value before remove: "+ hm);
		//remove value for key 102
		hm.remove(102);
		System.out.println("Value after remove :"+ hm);
	}
}