public class  JFT14Ex3
{
	public static void main(String[] args)
	{
		byte[] numbers = new byte[]{6,5,4,3,2,1};
		
		//System.out.println(numbers);
		try
		{
			System.out.println(numbers[2500]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error! Unable to access data - bad index.");
		}
	}
}