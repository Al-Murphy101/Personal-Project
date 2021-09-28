public class JFT6Ex9
{
	public static void main (String args [])
	{
		double currTemp = -6.9;
		
		if(currTemp >= 20)
		{
			System.out.println("Tropical");
		}
		else if(currTemp >= 10)
		{
			System.out.println("Warm");
		}
		else if(currTemp >= 0)
		{
			System.out.println("Moderate");
		}
		else if(currTemp >= -4)
		{
			System.out.println("Cold");
		}
		else if(currTemp <= -5)
		{
			System.out.println("Artic");
		}
	}
}