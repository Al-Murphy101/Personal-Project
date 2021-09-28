public class JFT4Ex4
{
	public static void main (String[] args)
	{
		int minutes = 199;
		int hours;
		int hour = 60;
		int minute;
		hours = minutes / hour;
		minute = minutes % hour;
		System.out.println("Hours: " + hours + " Minutes: " + minute);
	}
}