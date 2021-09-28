import java.util.Scanner;
import java.util.InputMismatchException;

public class Demo
{
	public static void main(String[] args)
	{
		//crate new scanner object
		Scanner scanner = new Scanner(System.in);
		
		//create variable to hold user entered values
		int numerator = 0;
		int denominator = 0;
		int result = 0;
		
		try{
			System.out.print("Enter numerator.....");
			numerator = scanner.nextInt();
			
			System.out.print("Enter denominator....");
			denominator = scanner.nextInt();
			
			result = numerator/denominator;
			System.out.println(numerator + "/" + denominator + " = " + result);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by 0");
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Please enter a whole number");
		}
		
		System.out.println("After exception handling code");
		
		
	}
}