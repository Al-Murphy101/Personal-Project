import java.util.Scanner;
import java.util.InputMismatchException;

public class  JFT14Ex4
{
	public static void main(String[] args)
	{
		String[] holiday = new String[5];
		int count = 1;
		
		holiday[0] = "Cork";
		holiday[1] = "Athlone";
		holiday[2] = "Limerick";
		holiday[3] = "Sligo";
		holiday[4] = "Dublin";
		
		System.out.println("The following holiday destinations are available.");
		
		for(int i =0; i <holiday.length; i++)
		{
		
			System.out.println(count + ": " + holiday[i]);
			count++;
		}
		
		
		
		Scanner s = new Scanner(System.in);
		
		int userEntry = 0;
		
		boolean userSelection = false;
		
		while(userSelection == false)
		{
			
			
			try
			{
				System.out.println("Enter a number to make your selection.");
			
				userEntry = s.nextInt();
				
				System.out.println("You'll have a great time in " + holiday[userEntry - 1] + "!");
				
				userSelection = true;
			}
			
			catch(InputMismatchException e)
			{
				System.out.println("Incorrect data entered. Enter a digit.");
				s.nextLine();
			}
			
			catch(ArrayIndexOutOfBoundsException f)
			{
				System.out.println("Please enter a value between 1 - 5.");
			}
			
		}
	}
}