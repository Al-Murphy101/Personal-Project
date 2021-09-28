public class VowelCount
{
	public String vowelCount(String message)
	{
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		
		char letter;
		
		for(int i = 0; i < message.length(); i++)
		{
			letter = message.charAt(i);
			
			switch(letter)
			{
				case 'a':
				case 'A':
				countA++;
				break;
				
				case 'e':
				case 'E':
				countE++;
				break;
				
				case 'i':
				case 'I':
				countI++;
				break;
				
				case 'o':
				case 'O':
				countO++;
				break;
				
				case 'u':
				case 'U':
				countU++;
				break;
			}
			
		}
		return "No. of vowels: " +countA+countE+countI+countO+countU + "\n" +
				"a count: " +countA+ "\n" + "e count: " + countE + "\n" + "i count: " +countI+ "\n" + "o count: " + countO +
				"\n" + "u count: " + countU;
	}
}