public class  JFT4Ex2 {

	public static void main (String[] args)
	{
		float cost = 14.50f;
		System.out.println("Cost of record = " + cost);
		System.out.println(" ");
		System.out.println("VAT = 23%.");
		float vat = 0.23f;
		float vatTotal = cost * vat;
		System.out.println(" ");
		System.out.println("Total VAT = "+ vatTotal);
		System.out.println(" ");
		float total = cost + vatTotal;
		System.out.println("Total selling price = " + total);
	
	}
}