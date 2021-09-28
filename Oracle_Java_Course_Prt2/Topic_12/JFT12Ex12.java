public class JFT12Ex12
{
	public static void main(String[] args)
	{
		String name = "Al Murphy";
		int age = 30;
		int averageAge = 23;
		
		if(age > averageAge)
		{
			System.out.printf("%s - your asge of %d is greater than the asverage age of (%d)", name, age, averageAge);
		}
		else 
		{
			System.out.printf("%s - your asge of %d is less than the asverage age of (%d)", name, age, averageAge);
		}
	}
}