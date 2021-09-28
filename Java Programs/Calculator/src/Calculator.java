import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("******Welcome To The Calculator");
        System.out.println("Enter 2 numbers....");
        // nextDouble() will read in the double value from user input
        double first = reader.nextDouble();
        double second = reader.nextDouble();

        //read in operator to use from user input - next().charAt(0)
        System.out.println("");
        System.out.println("**Now enter an operator**");
        System.out.println("(+ addition, - subtraction, * multiplication, / division)");
        char operator = reader.next().charAt(0);

        double result;
        //switch case for operations
        switch(operator){
            case '+':
            result = first + second;
            break;

            case '-':
            result = first - second;
            break;

            case '*':
            result = first * second;
            break;

            case '/':
            result = first/second;
            break;

            default:
            System.out.println("Wrong operator chosen, please try again");
            return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);

    }
}