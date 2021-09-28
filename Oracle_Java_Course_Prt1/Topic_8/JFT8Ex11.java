public class JFT8Ex11
{
	public static void main(String args [])
	{
		char [] fishing = new char[10];
		fishing[0] = 'Y';
		fishing[1] = 'Y';
		fishing[2] = 'Y';
		fishing[3] = 'Y';
		fishing[4] = 'Y';
		fishing[5] = 'Y';
		fishing[6] = 'N';
		fishing[7] = 'Y';
		fishing[8] = 'N';
		fishing[9] = 'N';
		
		//fishing = {"Y", "Y", "Y", "Y", "Y", "N", "N", "N", "N", "N"};
		
		int noOfResponses = 0;
		int noNeeded = 7;
		
		boolean goingAhead = false;
		
		for(int i =0; i < fishing.length; i++)
		{
			if(fishing[i] == 'Y')
			{
				noOfResponses++;
			}
			if(noOfResponses == noNeeded)
			{
				goingAhead = true;
				System.out.println("Lets go fishing.");
				break;
			}
		}
		
		if(goingAhead == true)
		{
			System.out.println("We can go fishing");
		}
		else
		{
			System.out.println("Not enough numbers for fishing");
		}
		
		
	}
}