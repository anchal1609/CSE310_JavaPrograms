import java.util.*;
class AbstractClass2
{
	public static void main(String[] arg)
	{
		iPhone obj1 = new iPhone();
		Samsung obj2 = new Samsung();
		show(obj1);
		show(obj2);
	}
	public static void show(Phone obj)
	{
		obj.showConfig();
	}
}
abstract class Phone
{
	public abstract void showConfig();
}
class iPhone extends Phone
{
	public void showConfig()
	{
		System.out.println("\niPhone X\nRam - 3GB\nStorage - 128GB\niOS - 11\nPrice - 1,34570\nFeeedBack - Don't buy it...\n");
	}
}
class Samsung extends Phone
{
	public void showConfig()
	{
		System.out.println("Samsung S9+\nRam - 6GB\nStorage - 128GB\nOS - Android\nPrice - 35000-60000\nFeeedBack - you can buy it...\n");	
	}
}