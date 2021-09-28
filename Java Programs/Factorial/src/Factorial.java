import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        //Scanner object
        Scanner scnr = new Scanner(System.in);
        System.out.println("***Factorial Algorithm***");
        System.out.println("Enter a number....");
        //Storing entered value
        int num = scnr.nextInt();
        //called the user defined function fact
        int factorial = fact(num);
        System.out.println("Factorial of number entered is: " + factorial);

    
    }
    //factorial funtion fact
    static int fact(int n){
        int output;
        if (n == 1){
            return 1;
        }

        //recursion - function calling itself
        output = fact(n-1) * n;
        return output;
    }

}