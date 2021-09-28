public class JFT8Ex10
{
	public static void main(String args [])
	{
		String [] passwords = new String [4];
		passwords[0] = "oxymoran";
		passwords[1] = "poxedfox";
		passwords[2] = "kingfisher";
		passwords[3] = "cruiseshipper";
		
		String user = "cruiseshipper";
		
		boolean userPassword = false;
		
		for(String password : passwords)
		{
			if (password.equals(user))
			{
				System.out.println("Log-On Successful!");
				userPassword = true;
				break;
			}
				
		}
		
		if(!userPassword)
		{
			System.out.println("User password not found!");
		}
	
	}
}