public class Vehicle
{
	private String manufacturer;
	private float engineSize;
	private String regNo;
	private boolean NCT;
	
	//Contructor Methods
	public Vehicle(String manufacturer, float engineSize, String regNo, boolean NCT)
	{
		this.manufacturer = manufacturer;
		this.engineSize = engineSize;
		this.regNo = regNo;
		this.NCT = NCT;
		
	}
	
	public Vehicle(String manufacturer, float engineSize, String regNo)
	{
		this(manufacturer, engineSize, regNo, false);
	}
	
	public Vehicle(String manufacturer, float engineSize)
	{
		this(manufacturer, engineSize, "not specified", false);
	}
	
	public Vehicle(String manufacturer)
	{
		this(manufacturer, 0.0f, "not specified", false);
	}
	
	public Vehicle()
	{
		this("not specified", 0.0f, "not specified", false);
	}
	
	//methods
	public String accelerate()
	{
		return "Accelerating...";
	}
	
	public String brake()
	{
		return "Breaking...";
	}
	
	
	
	
	//getters and setters
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	public void setEngineSize(float engineSize)
	{
		this.engineSize = engineSize;
	}
	
	public float getEngineSize()
	{
		return engineSize;
	}
	
	public void setRegNo(String regNo)
	{
		this.regNo = regNo;
	}
	
	public String getRegNo()
	{
		return regNo;
	}
	
	public void setNCT(boolean NCT)
	{
		this.NCT = NCT;
	}
	
	public boolean getNCT()
	{
		return NCT;
	}
	
	@Override
	public String toString()
	{
		return "Manufacturer: " + manufacturer + "\n" + "Engine Size: " + engineSize + "\n" +
			"Registration Number: " + regNo + "\n" + "Has NCT: " + NCT;	
	}
	
	
	
	
	
	
	
	
	
}