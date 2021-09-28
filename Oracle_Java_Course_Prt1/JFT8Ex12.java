public class JFT8Ex12
{
	public static void main(String args [])
	{
		int [] ages = {34, 16, 31, 19, 30, 19, 32, 11, 12, 13};
		String [] names = {"John", "Frank", "Anna", "Jenifer", "Francis", "Fred", "Philipa", "Jason", "Ian", "Derva"};
		
		int maxAge = 18;
		
		for(int i = 0; i < ages.length; i++)
		{
			if(ages[i] < 18)
			{
				continue;
			}
			
			if(ages[i] >= 18)
			{
				
				System.out.println(names[i] +" you are elegible to vote");
			}
		}
	
	}
}