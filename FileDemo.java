import java.io.File;
class FileDemo
{
	public static void main(String[] args) 
	{
		File f1 = new File("test.txt");
		System.out.println("File Name : "+ f1.getName());
		System.out.println("Abs Path : "+ f1.getAbsolutePath());
		System.out.println("Path : "+ f1.getPath());
		System.out.println("Parents : "+ f1.getParent());
		System.out.println(f1.exists()?"exit":"do not exit");
		System.out.println(f1.canWrite()?"is writeable":"isn't writeable");
		System.out.println(f1.canRead()?"is readable":"isn't readable");
		System.out.println("is "+(f1.isDirectory()?"":"not"+"a directory"));
		System.out.println(f1.isFile()?"is normal file":"might be a named pipe");
		System.out.println(f1.isAbsolute()?"is Absolute":"is not absolute");
		System.out.println("File last modified: "+f1.lastModified());
		System.out.println("File size: "+f1.length()+"Bytes");
	}
}