public class JFT4Ex7
{
	public static void main (String[] args)
	{
		float length = 25.00f;
		float width = 42.00f;
		float area;
		float feet;
		float convert = 9;
		float cost = 37.99f;
		float total;
		
		area = length * width;
		feet = area / convert;
		total = feet * cost;
		float yardTotal = feet * cost;
		
		System.out.println("***********************************");
		System.out.println("     Carpeting Cost Analysis");
		System.out.println("***********************************");
		System.out.println("");
		System.out.println("Square feet: " + area);
		System.out.println("Sqauer yards: " + feet);
		System.out.println("Cost of carpeting in Square Yards: " + yardTotal);
		//System.out.println("Cost of carpeting in Feet: " + total);
		
		
	}
}