public class Pizza
{
	String size;
	String toppings;
	float diameter;
	int price;
	
	public String eat()
	{
		return "Eat a pizza slowly, it can choke if you eat too fast!!";
	}
	
	public String toString()
	{
		return "Size: " +size+ "\n" + "Toppings: " +toppings+ "\n" + "Diameter: " +diameter+ "\n" + "Price: " + price; 
	}
	
}