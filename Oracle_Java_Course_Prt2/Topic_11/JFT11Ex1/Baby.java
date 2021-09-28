public class Baby extends Human
{
	//private instance variables
	private boolean isTeething;
	
	
	//getters and setters
	public void setIsTeething(boolean isTeething)
	{
		this.isTeething = isTeething;
	}
	
	public boolean getIsTeething()
	{
		return isTeething;
	}
	
	//override sleep() method in human
	@Override
	public String sleep()
	{
		if(isTeething == true)
		{
			return "Baby is tetthing and cant sleep";
		}
		else
		{
			return super.sleep();
		}
	}
	
	//override swim mwethod in Human class
	@Override
	public String swim()
	{
		return "A baby cannot swim safely!!";
	}
	
	public String toString()
	{
		return super.toString() + "\n" +
		"Baby is teething: " + isTeething;	
	}
}