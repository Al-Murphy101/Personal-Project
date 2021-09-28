public class Child extends Human
{
	//private instance variables
	private String schoolCardNo;
	
	//getter and setters
	public void setSchoolCardNo(String schoolCardNo)
	{
		this.schoolCardNo = schoolCardNo;
	}
	
	public String getSchoolCardNo()
	{
		return schoolCardNo;
	}
	
	//override the swin method in human
	public String swim()
	{
		if(getAge() <= 5)
		{
			return "As the child is 5 years old or younger, armbands must be worn and parental supervision is required " + "\n" +
					super.swim();
		}
		
		else 
		{
			//calling the super class version of swim from Human 
			return super.swim();
		}
	}
	
	public String toString()
	{
		return super.toString() + "\n" +
		"School Card Number: : " + schoolCardNo;	
	}
}