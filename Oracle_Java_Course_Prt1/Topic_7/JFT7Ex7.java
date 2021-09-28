import java.util.Scanner;
import java.util.Arrays;

public class JFT7Ex7
{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		String[] fruits = new String[5];
		
		
	    System.out.println("Please enter " + fruits.length + " of your favourite fruits");
		
		fruits[0] = input.next();
		fruits[1] = input.next();
		fruits[2] = input.next();
		fruits[3] = input.next();
		fruits[4] = input.next();
		
		System.out.println("Your favourite fruit are: ");
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		
		
   }
		

}