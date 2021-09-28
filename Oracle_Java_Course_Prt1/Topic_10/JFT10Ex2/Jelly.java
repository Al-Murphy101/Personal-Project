public class Jelly
{
	String manufacturer;
	float price;
	String flavour;
	float noCalories;
	String expiryDate;
	
	public String setInstructions()
	{
		return "Leave Jelly to set in a cool enviroment for 1hr.";
	}
	
	public String toString()
	{
		return "Manufacturer: " +manufacturer+ "\n" + "Price: " +price+ "\n" + "Flavour: " +flavour+ "\n" + "No of Calories: " +noCalories+ "Expiry Date: " +expiryDate; 
	}
}