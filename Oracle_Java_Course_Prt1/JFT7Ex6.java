public class JFT7Ex6
{
	public static void main (String args [])
	{
		String [] currency = {"GBP", "USD", "JPY"};
		float [] rates = {0.718836f, 1.12370f, 138.682f};
		float euro = 100.00f;
		
		System.out.println(currency[0] + "\t" + rates[0]);
		System.out.println(currency[1] + "\t" + rates[1]);
		System.out.println(currency[2] + "\t" + rates[2]);
		
		System.out.println("100 Euro convert to " + currency[0] + " is:" + (rates[0] * euro));
		System.out.println("100 Euro convert to " + currency[1] + " is:" + (rates[1] * euro));
		System.out.println("100 Euro convert to " + currency[2] + " is:" + (rates[2] * euro));
	}
}