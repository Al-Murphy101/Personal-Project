public class JFT6Ex8
{
	public static void main(String args [])
	{
		float grade = 44.00F;
		
		if(grade >= 80)
		{
			System.out.println("Grade achieved is an A");
		}
		else if (grade > 70)
		{
			System.out.println("Grade achieved is an B");
		}
		else if (grade > 55)
		{
			System.out.println("Grade achieved is an C");
		}
		else if (grade > 40)
		{
			System.out.println("Grade achieved is an D");
		}
		else if (grade > 25)
		{
			System.out.println("Grade achieved is an E");
		}
		else if (grade > 10)
		{
			System.out.println("Grade achieved is an F");
		}
		else
		{
			System.out.println("No Grade");
		}
	}
}