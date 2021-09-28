import java.util.*;

public class JFT13Ex1
{
	public static void main (String[] args)
	{
		float num1 = 10.05f;
		float num2 = 20.34f;
		
		float max = Math.max(num1, num2);
		float min = Math.min(num1, num2);
		
		System.out.printf("Max no. is: %.2f%n", max);
		System.out.printf("Min no: is: %.2f%n", min);
	}
}