public class JFT4Ex6
{
	public static void main (String[] args)
	{
		int amount = 57;
		
		int twenty = 20;
		int ten = 10;
		int five = 5;
		int one = 1;
		
		int mod = 0;
		int divide = 0;
		
		System.out.println("The sum of money is " +amount);
		divide = amount / twenty;
		mod = amount % twenty;
		System.out.println("No of 20's: " + divide);
		System.out.println("Remainder is " + mod);
		
		System.out.println(" ");
		
		divide = mod / ten;
		mod = amount % ten;
		System.out.println("No of 10's: " + divide);
		System.out.println("Remainder is " + mod);
		
		System.out.println(" ");
		
		divide = mod / five;
		mod = amount % five;
		System.out.println("No of 5's: " + divide);
		System.out.println("Remainder is " + mod);
		
		System.out.println(" ");
		
		divide = mod / one;
		mod = amount % one;
		System.out.println("No of 1's: " + divide);
		System.out.println("Remainder is " + mod);
		
		
		
		
		
	}
}