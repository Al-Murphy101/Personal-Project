import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JFT14Ex8
{
	public static void main(String[] args)
	{
		new JFT14Ex8().readFromFile();
	}
		public void readFromFile()
		{
			
			// Create a File object
			File file = new File("My Poem.txt");
		
		try{
			FileReader fr = new FileReader(file);
			
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null)
				{
					System.out.println(line);
					line = br.readLine();
				}
				
				System.out.println("The contents of the file have been successfully read!");
			}	
			
			catch(IOException e)
			{
				System.out.println("Unable to read the file!");
			}
			
		}
			
			
}

