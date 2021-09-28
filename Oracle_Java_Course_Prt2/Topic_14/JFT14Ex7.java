import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JFT14Ex7
{
	public static void main(String[] args)
	{
		new JFT14Ex7().writeToFile();
	}
		public void writeToFile()
		{
			File file = new File("My Poem.txt");
			
			
			try
			{
				//create file writer object
				FileWriter fw = new FileWriter(file, true);

				//create bufferedWritter object
				//it requires a reference to the filewriter object
				BufferedWriter bw = new BufferedWriter(fw);
				
				//create a PrintWriter object
				//it requires a refernce to the buffered reader object
				PrintWriter pw = new PrintWriter(bw);
				
				//use the printWriter object to write to the text file
				pw.println("The quick brown fox jumped over the moon.");
				pw.println("As he leapt, he looked back over his shoulder and cried aloud,");
				pw.println("Hello World!");
				
				
				System.out.println("Success!!");
				
				BufferedReader br = new BufferedReader(new FileReader("My Poem.txt");
				String line;
				while ((line = br.readline()) != null)
				{
					System.out.println(line);
				}
				
				//close the PrintWriter stream
				pw.close();
			}
			
			catch(IOException e)
			{
				System.out.println("Unable to create text file and print to it.");
			}
		}
	
}