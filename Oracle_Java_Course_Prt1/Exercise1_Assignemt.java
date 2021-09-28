/*
Written by : Alan Murphy
Date : 02/06/21
*/

public class Exercise1
{
	public static void main (String[] args)
	{
		//poplating player1 & player2 arrays
		int [] player1 = {10, 6, 8, 9, 7, 12, 7};
		int [] player2 = {7, 6, 9, 5, 2, 8, 11};
		
		//i & j variables to iterate and compare each element of both arrays
		int i = 0;
		int j = 0;
		//round variable to count each round
		int round = 1;
		//win1 & win2 variables to count what player won the round
		int win1 = 0;
		int win2 = 0;
		
		//enhanced for loop to iterate through both arrays
		for(int play1 : player1)
		{
		
				//compare the i'th element pf player1 to the i'th element of player2
				if(player1[i] > player2[j])
				{
					System.out.println("Round No: " + round + " - Player 1 wins the round! " + player1[i] + " beats " + player2[j]);
					System.out.println("");
					win1++;
				}//end if
				
				//compare the i'th element pf player2 to the i'th element of player1
				else if(player2[j] > player1[i])
				{
					System.out.println("Round No: " + round + " - Player 2 wins the round! " + player2[j] + " beats " + player1[i]);
					System.out.println("");
					win2++;
				}//end else if
				
				//else statement to print to screen if it is a draw
				else
				{
					System.out.println("Round No: " + round + " - Tie! " + player1[i] + " ties with " + player2[j]);
					System.out.println("");
				}//end else
				
				
				i++;
				j++;
				round++;	
		}//end for loop
		
		//if else statement to determine which player has won the most rounds 
		if(win1 > win2)
		{
			System.out.println("Player One Wins!! They won " + win1 + " rounds beating Player Two who won " + win2 + " rounds!");
		}
		else
		{
			System.out.println("Player Two Wins!! They won " + win2 + " rounds beating Player One who won " + win1 + " rounds!");
		}
		
	}
}