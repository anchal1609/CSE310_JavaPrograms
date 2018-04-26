import java.util.*;
class AbstractClass1
{
	public static void main(String[] args)
	{
		Linux obj = new Linux();     //Adarsh cannot create any object becouse it have abstract class
		obj.iMessage();
		obj.iBook();
		obj.FaceTime();
		obj.iPhotos();
	}
}
abstract class Mac
{
	public void iMessage()
	{
		System.out.println("Chatting...");
	}
	public abstract void iBook();
	public abstract void FaceTime();
	public abstract void iPhotos();
}
abstract class Window extends Mac
{
	public void iBook()
	{
		System.out.println("Reading...");
	}
}
class Linux extends Window
{
	public void FaceTime()
	{
		System.out.println("Video Chatting...");
	}
	public void iPhotos()
	{
		System.out.println("Photo Gallary...");
	}
}