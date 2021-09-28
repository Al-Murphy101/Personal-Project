public class Adult extends Human
{
	//private instance variables
	private String ppsNo;
	private String occupation;
	private boolean isMarried;
	private boolean isCarOwner;
	
	//getters and setters
	public void setPPSno(String ppsNo)
	{
		this.ppsNo = ppsNo;
	}
	
	public String setPPSno()
	{
		return ppsNo;
	}
	
	public void setOccupation(String occupation)
	{
		this.occupation = occupation;
	}
	
	public String setOccupation()
	{
		return occupation;
	}
	
	public void setIsMarried(boolean isMarried)
	{
		this.isMarried = isMarried;
	}
	
	public boolean setIsMarried()
	{
		return isMarried;
	}
	
	public void setIsCarOwner(boolean isCarOwner)
	{
		this.isCarOwner = isCarOwner;
	}
	
	public boolean setIsCarOwner()
	{
		return isCarOwner;
	}
	
	
	
	//methods
	public String drive()
	{
		return "Driving a car safely";
	}
	
	public String procreate()
	{
		return "Procreating";
	}
	
	public String toString()
	{
		return super.toString() + "\n" +
		"PPS No: " + ppsNo + "\n" +  "Occupation: " + occupation  + "\n" + 
	    "Marriage Status:" + isMarried + "\n" + "Car Owner: " + isCarOwner;	
	}
	
	
}