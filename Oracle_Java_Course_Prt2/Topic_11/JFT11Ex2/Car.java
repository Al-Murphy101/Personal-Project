public class Car extends Vehicle
{
	
	private static int carObjectCreated; 
	
	//constructors
	public Car(String manufacturer, float engineSize, String regNo, boolean NCT)
	{
		super(manufacturer, engineSize, regNo, NCT);
		Car.carObjectCreated++;
	}
	
	public Car(String manufacturer, float engineSize, String regNo)
	{
		this(manufacturer, engineSize, regNo, false);
	}
	
	public Car(String manufacturer, float engineSize)
	{
		this(manufacturer, engineSize, "not specified", false);
	}
	
	public Car(String manufacturer)
	{
		this(manufacturer, 0.0f, "not specified", false);
	}
	
	public Car()
	{
		this("not specified", 0.0f, "not specified", false);
	}
	
	//instance methods
	@Override
	public String brake()
	{
		return "Car Breaking...";
	}
	
	//static methods
	public static int getCarObjectCreated()
	{
		return Car.carObjectCreated;
	}
}
