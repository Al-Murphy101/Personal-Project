public class JFT8Ex5
{
	public static void main(String args [])
	{
		String [] songs = new String[5];
		songs[4] = "Michael Jackson";
		songs[3] = "Frankie Goes To Hollywood";
		songs[2] = "Queen";
		songs[1] = "Simple Minds";
		songs[0] = "Rick Astley";
		
		for(int i = 4; i >= 0; i--)
		{
			System.out.println("No " + (i+1) + ": " + songs[i]);
		}
	
	}
}