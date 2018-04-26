//Invenstion
//Discovry
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
public class InterfaceEx2WithAnnomanous
{
	public static void main(String[] args)
	{
		Data obj1 = new Data()
		{
			public void show()
			{
				System.out.println("Data Showing...");
			}
			public void hide()
			{
				System.out.println("Data Hiding...");
			}
		};
		CloudeData obj2 = new CloudeData()
		{
			public void online()
			{
				System.out.println("Data is online...");
			}
			public void offline()
			{
				System.out.println("Data is offline...");
			}
		};
		obj1.show();
		obj2.online();
	}
}
