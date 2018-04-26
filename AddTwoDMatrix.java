import java.util.*;
class AddTwoDMatrix
{
	public static void main(String[] arg)
	{
		Scanner obj = new Scanner(System.in);
		int i,j,k=0,n;
		System.out.println("Enter the values of row and columne: ");
		n = obj.nextInt();
		int M1[][] = new int [n][n];
		int M2[][] = new int [n][n];
		int sumM[][] = new int [n][n];
 		System.out.println("Enter the value of M1 elements: ");
		for (i=0; i<n; i++)
		{
			for (j=0; j<n; j++) 
			{
				k = obj.nextInt();
				M1[i][j] = k;	
			}	
		}
		System.out.println("Enter the value of M2 elements: ");
		for (i=0; i<n; i++)
		{
			for (j=0; j<n; j++) 
			{
				k = obj.nextInt();
				M2[i][j] = k;	
			}	
		}
		System.out.println("Your matrix SUM is: ");
		for (i=0; i<n; i++)
		{
			for (j=0; j<n; j++)
			{
				sumM[i][j] = M1[i][j] + M2[i][j];
				System.out.print(sumM[i][j]+" ");
			}	
			System.out.println( );
		}
	}
}