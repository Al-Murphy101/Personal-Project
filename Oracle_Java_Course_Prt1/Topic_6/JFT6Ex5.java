public class JFT6Ex5
{
	public static void main (String args [])
	{
		int withdraw = 20;
		int balance = 180;
		
		String bank = (withdraw < balance) ? "Withdraw Processed" : "Insufficient Funds";
		System.out.println(bank);
		
	}
	
}