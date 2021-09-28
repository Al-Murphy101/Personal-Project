public class JFT12Ex7
{
	public static void main(String[] args)
	{
		String s1 = "Message in a bottle";
		String s2 = "Message in a jar";
		
		System.out.println("message 1 length: " + s1.length() + "chars.");
		System.out.println("message 1 length: " + s2.length() + "chars.");
		
		if(s1.length() > s2.length())
		{
			System.out.println("Message in a bottle is longer than Message in a jar");
		}
		
		else if (s1.length() < s2.length())
		{
			System.out.println("Message in a jar is longer than Message in a bottle");
		}
		
		else
		{
			System.out.println("Both messages are the same length");
		}
	}
}