//This program will determine if a number or string is palindrome
import java.lang.Thread.State;
import java.util.Scanner;

public class Palindrome{
    static void checkPalindrome(String input){
    //assign boolean to true
    boolean result = true;
    //determine length of user input
    int length = input.length();
        //divide string by 2 to compare
        for(int i=0; i <= length/2; i++){
            //compare character at start and end of number/string
            if(input.charAt(i) != input.charAt(length-i-1)){
                result = false;
                break;
            }
        }
        System.out.println(input + " is palindrome = " + result);
    }
        public static void main(String[] args){
            Scanner scanner = new Scanner (System.in);
            System.out.println("Please enter your statement");
            String strng = scanner.nextLine();
            //call the checkPaalindrome function
            checkPalindrome(strng);

        }
}
