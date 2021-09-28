public class JFT14Ex1
{
	public static void main(String[] args) //throws NumberFormatException
	{
		String value = "two";
		int parsedValue = 0;
		
		try
		{
			parsedValue = Integer.parseInt(value);
		}
		
		catch(NumberFormatException nfe)
		{
			System.out.println("ERROR. Unable to parse data. Program closing");
		}
	}
}