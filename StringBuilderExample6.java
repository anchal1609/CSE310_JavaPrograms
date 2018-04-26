class StringBuilderExample6
{
	public static void main(String[] arg)
	{
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capaciy());
		sb.appand("Hello");
		System.out.println(sb.capaciy());
		sb.appand("java is my fav language");
		System.out.println(sb.capacity());
		//now (16*2)+2=34 i.e(oldcapacity*2)+2
	}
}