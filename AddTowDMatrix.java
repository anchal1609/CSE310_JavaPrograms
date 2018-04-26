import java.util.*;
class TwoDArray
{
	public static void main(String[] arg)
	{
		Scanner obj = new Scanner(System.in);
		int i,j,k=0,n;
		System.out.println("Enter the values of row and columne: ");
		n = obj.nextInt();
		int twoD[][] = new int [n][n];
		System.out.println("Enter the value of elements: ");
		for (i=0; i<n; i++)
		{
			for (j=0; j<n; j++) 
			{
				k = obj.nextInt();
				twoD[i][j] = k;	
			}	
		}
		System.out.println("Your matrix is: ");
		for (i=0; i<n; i++)
		{
			for (j=0; j<n; j++)
			{
				System.out.print(twoD[i][j]+" ");
			}	
			System.out.println( );
		}
	}
}