public class JFT6Ex4
{
	public static void main (String args [])
	{
		int withdraw = 20;
		int balance = 180;
		
		if (withdraw < balance)
		{
			System.out.println("Withdrawal processed: " + withdraw);
			System.out.println("New balance: " + (balance - withdraw));
		}
		
		else
		{
			System.out.println("Insufficient funds!");
		}
	}
}