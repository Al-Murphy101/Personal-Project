import java.util.*;

public class  JFT13Ex2
{
	public static void main(String[] args)
	{
		// Create a Random object
		Random r = new Random();
		// Declare a variable to hold a random int
		// The random number generated should be between 1-10 inc.
		int rand = r.nextInt(10) + 1; // 0 - 9 returned, so add 1.
		System.out.println(rand);
	}
}