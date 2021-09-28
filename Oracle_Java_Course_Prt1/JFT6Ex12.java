public class JFT6Ex12
{
	public static void main (String args [])
	{
		char status = 'S';
		
		switch (status)
		{
			case 'S':
				System.out.println("Single");
			break;
			
			case 'D':
				System.out.println("Divorced");
			break;
			
			case 'M':
				System.out.println("Married");
			break;
			
			case 'W':
				System.out.println("Widowed");
			break;
			
			default:
				System.out.println("Invalid Data Inputed");
			
		}
	}
}