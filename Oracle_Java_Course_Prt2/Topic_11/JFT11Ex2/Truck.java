public class Truck extends Vehicle
{
	private boolean isTrailer;
	
	
	//getter and setter
	public void setIsTrailer(boolean isTrailer)
	{
		this.isTrailer = isTrailer;
	}
	
	public boolean getIsTrailer()
	{
		return isTrailer;
	}
	
	public Truck (String manufacturer, float engineSize, String regNo, boolean NCT)
	{
		super(manufacturer, engineSize, regNo, false);
	}
	
	public Truck (String manufacturer, float engineSize, String regNo)
	{
		this(manufacturer, engineSize, regNo, false);
	}
	
	public Truck (String manufacturer, float engineSize)
	{
		this(manufacturer, engineSize, "not specified", false);
	}
	
	public Truck (String manufacturer)
	{
		this(manufacturer, 0.0f, "not specified", false);
	}
	
	public Truck ()
	{
		this("not specified", 0.0f, "not specified", false);
	}
	
	//method override
	public String brake()
	{
		return "Truc Breaking...";
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\n" +
				"Has trailer? " + isTrailer;
	}
	
}