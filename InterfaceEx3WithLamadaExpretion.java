interface Data 
{
	void show();
}
interface CloudeData
{
	void online();
}
public class InterfaceEx3WithLamadaExpretion
{
	public static void main(String[] args)
	{
		Data obj1 = () -> System.out.println("Data Showing...");
		CloudeData obj2 = () -> System.out.println("Data is online...");
		obj1.show();
		obj2.online();
	}
}
