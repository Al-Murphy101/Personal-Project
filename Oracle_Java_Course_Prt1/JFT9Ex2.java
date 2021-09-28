import java.util.ArrayList;

public class JFT9Ex2
{
	public static void main(String[] arags)
	{
		ArrayList<String> country = new ArrayList<String>();
		country.add("Ibiza");
		country.add("Gran Canaria");
		country.add("Nice");
		country.add("Tropea");
		
		//add entry at particular index
		country.add(2, "Furteventura");
		
		
		
		
		for(int i = 0; i < country.size(); i++)
		{
			System.out.println(country.get(i));
		}
		
		System.out.println("");
		System.out.println(country.isEmpty());
		System.out.println(country.size());
		System.out.println(country.indexOf("Tropea"));
		country.add(2, "Furteventura");
		System.out.println(country.contains("Nice"));
		
		System.out.println("");
		System.out.println("Removing Gran Canaria.");
		System.out.println("");
		country.remove("Gran Canaria");
		
		for(int i = 0; i < country.size(); i++)
		{
			System.out.println(country.get(i));
		}
		
		if(country.contains("Nice"))
		{
		
			System.out.println("Yes the ArrayList contains Nice");
		
		}
		
		
	}
}