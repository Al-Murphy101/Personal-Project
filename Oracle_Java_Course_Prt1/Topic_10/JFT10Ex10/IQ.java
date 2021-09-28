public class IQ
{
	//instance variable
	private String name;
	private int age;
	private float iQScore;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		if(! ((age < 1) || (age > 115)))
		{
			this.age = age;
		}
		
	}
	
	public float getIQScore()
	{
		return iQScore;
	}
	
	public void setIQScore(float iQScore)
	{
		if(! ((iQScore < 0) || (iQScore > 200)))
		{
			this.iQScore = iQScore;
		}
	}
	
	public String iqReport()
	{
		if(iQScore < 100)
		{
			return "Your score of " + iQScore + " is below average!";
		}
		
		else if(iQScore >= 100 && iQScore <= 15)
		{
			return "Your score of " + iQScore + "is above average!";
		}
		
		else
		{
			return "Your score of " + iQScore + " is exceptional!";
		}
	}
	
	public String toString()
	{
		return "Name: " + name + "\n" + "Age: " + age + "\n" + "IQ Score: " + iQScore + "\n";
	}
	
	
	
	
	
	
}