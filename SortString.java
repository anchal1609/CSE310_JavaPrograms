import java.util.*;
class SortString
{
	static String arr[]={"Now","is","the","time","for","all","good","man", "to", "come", "the" ,"aid" ,"of", "their" ,"country"};
	public static void main(String[] args) 
	{
		for (int j=0;j<arr.length;j++ ) 
		{
			for (int i=j+1;j<arr.length;i++ ) 
			{
				if (arr[i].compareTo(arr[j])<0) 
				{
					String t=arr[j];
					arr[j]=arr[i];
					arr[i]=t;					
				}				
			}
			System.out.println(arr[j]);			
		}		
	}
}