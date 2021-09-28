public class JFT14Ex2
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try
		{
			result = num1/num2;
			System.out.println("The result is " + result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: Arithmetic Exception. Cannot / 0. Program closing!");
		}
	}
}