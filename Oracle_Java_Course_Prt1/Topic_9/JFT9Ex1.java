import java.util.ArrayList;

public class JFT9Ex1
{
	public static void main (String[] args)
	{
		ArrayList<String> albums = new ArrayList<String>();
		albums.add("Thriller");
		albums.add("The Dark Side of the Moon");
		albums.add("Bat Out of Hell");
		albums.add("Back in Black");
		albums.add("Come on Over");
		albums.add("Led Zeppelin");
		albums.add("Jagged Little Pill");
		
		for(String title : albums)
		{
			System.out.println(title);
		}
	}
}