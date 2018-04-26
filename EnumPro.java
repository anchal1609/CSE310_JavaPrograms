import java.util.*;
class EnumPro
{
	public enum direction{UP, DOWN, RIGHT, LEFT}
	public static void main(String[] args)
	{
		for(direction dir : direction.values())
			System.out.println(dir); 
	}
}