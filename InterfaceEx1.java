interface Data 
{
	void show();
	void hide();
}
interface CloudeData
{
	void online();
	void offline();
}
class Database implements Data,CloudeData
{
	public void show()
	{
		System.out.println("Data Showing...");
	}
	public void hide()
	{
		System.out.println("Data Hiding...");
	}
	public void online()
	{
		System.out.println("Data is online...");
	}
	public void offline()
	{
		System.out.println("Data is offline...");
	}
}
public class InterfaceEx1
{
	public static void main(String[] args)
	{
		Data obj1 = new Database();
		CloudeData obj2 = new Database();
		obj1.show();
		obj2.online();
	}
}
