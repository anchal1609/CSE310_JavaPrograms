import java.util.*;
class AssertionEx1
{
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int i1 = obj.nextInt();
		int i2 = obj.nextInt();
		int i3 = obj.nextInt();
		assert i1>i2:"1st one is grater";
		assert i1>i3:"1st one is grater";
		assert i2>i1:"2nd one is grater";
		assert i2>i3:"2nd one is grater";
		assert i3>i2:"3rd one is grater";
		assert i3>i1:"3rd one is grater";
	}
}