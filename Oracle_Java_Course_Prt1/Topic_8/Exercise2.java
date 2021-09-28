/*
Written by : Alan Murphy
Date : 02/06/21
*/


public class Exercise2
{
	public static void main(String[] args)
	{
		//array for loan amounts
		int [] loans = {60, 20, 100, 80, 40, 300, 200, 100};
		//savings variable initilaised to 500
		int savings = 500; 
		//counter for the for loop
		int i = 0;

		//enhanced for loop to iterate over array of loan amounts
		for(int loan : loans)
		{
			//if statement to see if savings is greater than the loan
			if(savings > loans[i])
			{
				System.out.println("Cash in the pot: " + savings);
				System.out.println("Loan amount requested: " + loans[i] + " - Loan amount granted!");
				System.out.println("");
				//deduct loan from savings
				savings = savings - loans[i];
			}
			
			//else if to determine loan is greater than savings
			else if(savings > 0 && loans[i] > savings)
			{
				System.out.println("Cash in the pot: " + savings);
				System.out.println("Loan amount requested: " + loans[i]);
				System.out.println("The exact loan request amount cannot be processed in full (insufficent funds available. However, we will give you what we can... " + savings);
				System.out.println("");
				//deduct remaining savings from savings
				savings = savings - savings;
				
				System.out.println("Cash in the pot: " + savings);
				System.out.println("The following loan requests could not be facilitated.");
				
				
			}
			
			//else if to determine if savings is equal to zero
			else if(savings == 0)
			{
				System.out.println(loans[i]);
			}
			//counter used to iterate through each element of the array
			i++;
		}
		
		
	}
}