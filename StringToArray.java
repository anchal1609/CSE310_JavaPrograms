import java.util.*;
class StringToArray
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any string which you want to convert into array: ");
		String s = obj.nextLine();
		char c[] = s.toCharArray();
		for (int i=0; i<s.length(); i++) 
		{
			if (c[i]>=65 && c[i]<=90) 
			{
				c[i] += 32;
				System.out.println(c[i]);	
			}	
		}
		String s1 = "Hello".replace('l','w');
		System.out.println(s1);
		String s2 = "SachinTendulkar";  
		System.out.println(s2.substring(6));
		String s3 = "  Sachin  ";  
		System.out.println(s3);//  Sachin    
		System.out.println(s3.trim());//Sachin
		String s4="Sachin";  
		System.out.println(s4.toUpperCase());
		//SACHIN  
		System.out.println(s4.toLowerCase());
		//sachin  
		System.out.println(s4);
		//Sachin(no change in original)
	}
}