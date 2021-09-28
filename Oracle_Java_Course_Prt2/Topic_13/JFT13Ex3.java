// printf() method v's DecimalFormat
//import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class JFT13Ex3
{
	public static void main(String[] args)
	{
		 // Create a Scanner object
		Scanner scan = new Scanner(System.in);
		
		// Create a DecimalFormat object
		DecimalFormat dec = new DecimalFormat(".00");
		
		// A variable to store user entry
		float userInput = 0.0f;
		
		// Ask the user to enter a float value
		System.out.println("Enter a decimal number");
		
		// Process user entry
		userInput = scan.nextFloat();
		
		// Use the DecimalFormat object to format the output string to 2 decimal places.
		System.out.println("Using decimal format: " + dec.format(userInput));
		
		// Use the printf() method to format output to 2 decimal places
		System.out.printf("Using printf: %.2f%n", userInput);
	}
}