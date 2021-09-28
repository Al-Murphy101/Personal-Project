import java.util.Scanner;
import java.util.InputMismatchException;

public class JFT14Ex5 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		String userMessage;
		
		System.out.print("Enter a message: ");
		
		userMessage = s.nextLine();
		
		System.out.println(userMessage);
		
		boolean userChoice = false;
		
		char extract;
		
		int position;
		
		System.out.print("Now enter the position of the character you want to extract: ");
		
		
		do{
			try
			{
				position = s.nextInt();
				System.out.print("The extpected character from your message is: " + userMessage.charAt(position - 1));
				userChoice = true;
			}
			
			catch(InputMismatchException e){
				System.out.print("Error. Please enter a number to indicate the position ");
				s.nextLine();
			}
			
			catch(StringIndexOutOfBoundsException f)
			{
				System.out.println("Error. Please enter a number less than " + userMessage.length() + " charcters: ");
			}
			
		}while(userChoice == false);
	}
}