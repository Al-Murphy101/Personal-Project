import java.text.DecimalFormat;
// To use the DecimalFormat class - rounding numbers.
import java.util.Scanner;
// To use the Scanner class – accept input from the console.
public class VATPayable{
 public static void main(String args[]){

 //Create a Scanner object
 Scanner input = new Scanner(System.in); // Line 1
 //Decimal place formatting:
 DecimalFormat df = new DecimalFormat(".00"); // Line 2
 double purchaseAmount = 0.0;
 final double vatRate = 0.23;
 double vatPayable = 0.0;
 double totalPaymentDue = 0.0;
 //Notice the use of the print and not the println method.
 // This keeps the cursor flashing on the same line, awaiting user input.
 System.out.print("Enter purchase amount in euro: ");

 //Use the nextDouble() method of the Scanner object.
 //The user enters a double and it is stored in the purchaseAmount variable.
 purchaseAmount = input.nextDouble(); // Line 3

 //Calculations:
 vatPayable = (purchaseAmount * vatRate);
 totalPaymentDue = (purchaseAmount + vatPayable);
 //Outputs:
 System.out.println("Purchase Amount: " + purchaseAmount);
 System.out.println("Vat Rate: " + vatRate);
 System.out.println("Vat Payable is: " + df.format(vatPayable)); // Line 4
 System.out.println("Total Payment due is: " + df.format(totalPaymentDue)); // Line 5

 }//main
}//class