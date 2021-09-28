public class Smartphone
{
	String name;
	String manufacturer;
	float price;
	String releaseDate;
	float creditRemaining;
	boolean isFullyCharged;
	
	//static variabkles
	public static int noOfPhones;
	public static float totalPrice;
	
	//instance methods
	public void makeCall(String noToCall)
	{
		System.out.println("Dialing number: " + noToCall);
	}
	
	public void topUpCredit(float topUpAmount)
	{
		creditRemaining += topUpAmount;
		System.out.println("You have successfully topped up by: " + topUpAmount);
		System.out.println("Your new balance is: " + creditRemaining);
		
	}
	
	public void charge()
	{
		isFullyCharged = true;
		System.out.println("Your phone is now fully re-charged!" );
	}
	
	public String toString()
	{
		return "Name: " + name + "\n" + "Manufacturer: " + manufacturer + "\n" + "Price: " + price +
				"\n" + "Release Date: " + releaseDate + "\n" + "Credit Remaining: " + creditRemaining
				+ "\n" + "Fully Charge: " + isFullyCharged;
	}
	
	//static methods
	public static float getAverage()
	{
		return Smartphone.totalPrice / Smartphone.noOfPhones;
	}
	
}