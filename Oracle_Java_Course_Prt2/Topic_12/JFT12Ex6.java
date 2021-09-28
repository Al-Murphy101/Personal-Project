public class JFT12Ex6
{
	public static void main(String[] args)
	{
		String userEnteredPassword = "javabeans";
		String password = "JAVABEANs";
		
		if(userEnteredPassword.equalsIgnoreCase(password))
		{
			System.out.println("Log-in Successful");
		}
		else
		{
			System.out.println("Cannot log-in");
		}
		
		
	}
}