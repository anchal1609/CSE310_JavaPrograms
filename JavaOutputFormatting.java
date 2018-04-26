import java.util.Scanner;

public class JavaOutputFormatting 
{

    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
        String ws = "";
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                    String numberAsString = String.valueOf(x);
                    StringBuilder sb = new StringBuilder();
                    while(sb.length()+numberAsString.length()<3) 
                    {
                        sb.append('0');
                    }
                   sb.append(x);
                   String paddedNumberAsString = sb.toString();
                int numberOfSpaces = 15-s1.length();
		String space = String.format("%"+ numberOfSpaces +"s", " ");
                System.out.println(s1+space+paddedNumberAsString);
            }
            System.out.println("================================");

    }
}

