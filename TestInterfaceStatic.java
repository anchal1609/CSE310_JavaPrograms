interface Drawable
{
	void draw();
	static int cube (int x)
	{
		return x*x*x;
	}
	class Rectange implements Drawable
	{
		public void draw()
		{
			System.out.println("Drawing rectangle");
		}
	}
	class TestInterfaceStatic
	{
		public static void main(String[] args)
		{
			Drawable d = new Rectange();
			d.draw();
			System.out.println(Drawable.cube(3));
		}
	}
}