class StringExample
{
	public static void main(String[] args) 
	{
		String s = "Hello Hahahaha Hurray How You doing.";
		String s1 = "Hello hahahaha Hurray how You Doing.";
		System.out.println(s.charAt(5));
		System.out.println(s.startsWith(6));
		System.out.println(s.endWith("oing."));
		System.out.println(s1.endWith("oing."));
		boolean b = s.endsWith("ing");
		System.out.println(b);
		System.out.println(s.equal(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.length());
		System.out.println(s1.indexOf('s'));
		System.out.println(s1.indexOf('s',10));
		System.out.println(s1.lastIndexOf('s'));
		String []sa=ss.split(",");
		System.out.println(sa[0]);
		System.out.println(sa[1]);
		System.out.println(sa[2]);
		String str="Hello World";
		int length=str.length();
		System.out.println("length of string "+length);
		String s11="Welcome to java";
		String s12=new String("Welcome to java");
		String s3="Welcome to java";
		String s4=new String("Welcome to java");
		System.out.println("s11==s2 is"+(s1==s2));
		System.out.println("s11==s3 is"+(s1==s3));
		System.out.println("s2==s4 is"+(s2==s4));
		String s5=new String("Welcome");
		String s6="Welcome";

		if(s5.equals(s6))
		{
		System.out.println("s5 and s6 have the same contents.");

		}
		if(s5==s6)
		{
		System.out.println("s5 and s6 have the same references.");
		}

		if(s5.compareTo(s6)>0)
		{
		System.out.println("s5 is greater than s6."+s5.compareTo(s6));
		}
		else 
			if(s5.compareTo(s6)==0)
			{
				System.out.println("s5 is greater than s6."+s5.compareTo(s6));
			}
		else
			System.out.println("s5 is less then s6."+s5.compareTo(s6));

	}
}