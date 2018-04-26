import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class LocalTimeExample1
{
	public static void main(String[] args) 
	{
	//Example1
		LocalTime time = LocalTime.now();
		System.out.println(time);
	//Example2
		LocalTime time1 = LocalTime.of(10,43,12);
		System.out.println(time1);
	//Example3
		LocalDateTime datetime1 = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMyyy HH:mm:ss");
		String formatDateTime = datetime1.format(format);
		System.out.println(formatDateTime);
	}
}