import java.util.Scanner;
import java.util.InputMismatchException;

public class  JFT14Ex6
{
	public static void main(String[] args)
	{
		new JFT14Ex6().stringExtract();
	}
	
	public void stringExtract()
	{
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a message: ");
		String userMessage;
		userMessage = s.nextLine();
		
		//split the string
		String[] split = userMessage.split(" ");
		
		//variable to hold the extracted string/word
		String stringExtract = "";
		
		//System.out.println(userMessage);
		boolean userExtract = false;
		
		do
		{
			try
			{
				int wordExtract;
				System.out.println("Enter the position of the word to extract: for example 2: ");
				wordExtract = s.nextInt();
				
				//extract the string at the specific position
				stringExtract = split[wordExtract - 1];
				
				//Display extracted word
				System.out.println("Expected word: " + stringExtract);
				userExtract = true;
			}
			
			catch(InputMismatchException e)
			{
				System.out.println("Enter a number, not text!");
				s.nextLine();
			}
			
			catch(ArrayIndexOutOfBoundsException f)
			{
				System.out.println("Enter a number less than or equal to " + split.length);
				
			}
			
		}while(userExtract == false);
		
		
	}
}