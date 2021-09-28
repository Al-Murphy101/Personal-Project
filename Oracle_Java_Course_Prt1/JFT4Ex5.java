public class JFT4Ex5
{
	public static void main (String[] args)
	{
		float invest = 1000.00f;
		float interest = 0.05f;
		float interEarn;
		float totalValue;
		
		System.out.println("The principal investment is " + invest + "euro");
		System.out.println("The rate of interest is " + interest);
		
		interEarn = invest * interest;
		System.out.println("The interest earned is " + interEarn);
		
		totalValue = invest + interEarn;
		System.out.println("The value of the investment is " + totalValue);
		
		
	}
}